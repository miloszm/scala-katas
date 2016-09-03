package com.ce

object FizzBuzzStep1 {

  def generate(i: Int):String = {
    def fizzBuzz(n:Int, s:String)(i:Int):Option[String] = if (i % n == 0) Some(s) else None
    val fizz = fizzBuzz(3,"fizz")(_)
    val buzz = fizzBuzz(5,"buzz")(_)
    val list = fizz(i).toList ::: buzz(i).toList
    if (list.isEmpty) i.toString else list.mkString
  }

  def generate(r:Range):String = {
    r.map(generate(_)).mkString(" ")
  }

}
