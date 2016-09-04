package com.ce

object FizzBuzzStep1 {

  def generate(i: Int):String = {
    val fizzBuzz = List("fizz").filter(_ => i % 3 == 0) ::: List("buzz").filter(_ => i % 5 == 0)
    if (fizzBuzz.isEmpty) i.toString else fizzBuzz.mkString
  }

  def generate(r:Range):String = {
    r.map(generate(_)).mkString(" ")
  }

}
