package com.ce

import com.ce.FizzBuzzStep3.OutputType.OutputType

object FizzBuzzStep3 {

  object OutputType extends Enumeration {
    type OutputType = Value
    val fizz, buzz, fizzbuzz, lucky, integer = Value
  }

  def generate(i: Int):(String,OutputType) = {
    val fizzList = List("fizz").filter(_ => i % 3 == 0)
    val buzzList = List("buzz").filter(_ => i % 5 == 0)
    def lucky(n:Int) = Option(("lucky",OutputType.lucky)).filter(_ => n.toString contains '3')
    val fizzBuzzList = fizzList ::: buzzList
    val fizzBuzzString = fizzBuzzList.mkString
    val fizzBuzz = if (fizzBuzzList.isEmpty) None else Some (fizzBuzzString,OutputType.withName(fizzBuzzString))
    val fizzBuzzLucky = lucky(i).orElse(fizzBuzz)
    fizzBuzzLucky.getOrElse((i.toString,OutputType.integer))
  }

  def generate(r:Range):String = {
    val counter = Array.fill[Int](OutputType.maxId)(0)
    val mainOutput = r.map(generate(_)).map(o => {counter(o._2.id)+=1; o._1}).mkString(" ")
    val statOutput = (0 until OutputType.maxId).map(i => OutputType(i).toString + ": " + counter(i)).mkString("\n")
    mainOutput + "\n" + statOutput
  }

}
