package com.ce

import com.ce.FizzBuzzStep3.OutputType.OutputType

object FizzBuzzStep3 {

  object OutputType extends Enumeration {
    type OutputType = Value
    val Fizz, Buzz, FizzBuzz, Lucky, Integer = Value
  }

  def generate(i: Int):(String,OutputType) = {
    val fizzList = List("fizz").filter(_ => i % 3 == 0)
    val buzzList = List("buzz").filter(_ => i % 5 == 0)
    val fizzBuzzOutputType = (fizzList, buzzList) match {
      case (f::Nil, b::Nil) => OutputType.FizzBuzz
      case (f::Nil, Nil) => OutputType.Fizz
      case (Nil, b::Nil) => OutputType.Buzz
      case _ => OutputType.Buzz
    }
    val fizzBuzzList = fizzList ::: buzzList
    val fizzBuzz = Option((fizzBuzzList.mkString,fizzBuzzOutputType)).filterNot(_ => fizzBuzzList.isEmpty)
    def lucky(n:Int) = Option(("lucky",OutputType.Lucky)).filter(_ => n.toString contains '3')
    val fizzBuzzLucky = lucky(i).orElse(fizzBuzz)
    fizzBuzzLucky.getOrElse((i.toString,OutputType.Integer))
  }

  def generate(r:Range):String = {
    val counter = Array.fill[Int](OutputType.maxId)(0)
    val mainOutput = r.map(generate(_)).map(o => {counter(o._2.id)+=1; o._1}).mkString(" ")
    val statOutput = (0 until OutputType.maxId).map(i => OutputType(i).toString.toLowerCase + ": " + counter(i)).mkString("\n")
    mainOutput + "\n" + statOutput
  }

}
