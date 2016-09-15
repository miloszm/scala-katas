package com.mm

object FibonacciStream extends App {

  def fibs:Stream[Int] = 0 #:: fibs.scanLeft(1)(_ + _)

//  println(fibs.take(10).force)


  def fibonacci: Stream[Int] = {
    def loop(a: Int, b: Int): Stream[Int] = (a + b) #:: loop(b, b + a)
    0 #:: 1 #:: loop(0, 1)
  }
  println(fibonacci.take(10).force)

}
