package com.ce

object FizzBuzzStep2 {

  def generate(i: Int):String = {
    def fizzBuzz(n:Int, s:String)(i:Int) = if (i % n == 0) Some(s) else None
    def lucky(n:Int) = if (n.toString contains '3') Option("lucky") else None
    val fizz = fizzBuzz(3,"fizz")(_)
    val buzz = fizzBuzz(5,"buzz")(_)
    val string = lucky(i).getOrElse((fizz(i).toList ::: buzz(i).toList).mkString)
    if (string.isEmpty) i.toString else string
  }

  def generate(r:Range):String = {
    r.map(generate(_)).mkString(" ")
  }

}
