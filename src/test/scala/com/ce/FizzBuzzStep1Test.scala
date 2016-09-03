package com.ce

import org.scalatest.{FlatSpec, Matchers}


class FizzBuzzStep1Test extends FlatSpec with Matchers {

  "FizzBuzz generator for a given number" should "produce Fizz for multiples of 3" in {
    FizzBuzzStep1.generate(9) shouldBe "fizz"
  }

  "FizzBuzz generator for a given number" should "produce Buzz for multiples of 5" in {
    FizzBuzzStep1.generate(10) shouldBe "buzz"
  }

  "FizzBuzz generator for a given number" should "produce FizzBuzz for if it is a multple of 15" in {
    FizzBuzzStep1.generate(15) shouldBe "fizzbuzz"
  }

  "FizzBuzz generator for a given number" should "produce string representation of a number if it is neither multiple of 3 nor 5" in {
    FizzBuzzStep1.generate(14) shouldBe "14"
  }

  "FizzBuzz generator for a range 1 to 20" should "produce valid a list of valid outputs for each number in range" in {
    FizzBuzzStep1.generate(1 to 20) shouldBe "1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz"
  }

}
