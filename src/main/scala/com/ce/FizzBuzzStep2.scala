package com.ce

object FizzBuzzStep2 {

  def generate(i: Int):String = {
    val fizzBuzzList= List("fizz").filter(_ => i % 3 == 0) ::: List("buzz").filter(_ => i % 5 == 0)
    val fizzBuzz = Option(fizzBuzzList.mkString).filterNot(_ => fizzBuzzList.isEmpty)
    def lucky(n:Int) = Option("lucky").filter(_ => n.toString contains '3')
    val fizzBuzzLucky = lucky(i).orElse(fizzBuzz)
    fizzBuzzLucky.getOrElse(i.toString)
  }

  def generate(r:Range):String = {
    r.map(generate(_)).mkString(" ")
  }

}
