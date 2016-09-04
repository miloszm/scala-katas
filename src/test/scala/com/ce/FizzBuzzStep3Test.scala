package com.ce

import org.scalatest.{FlatSpec, Matchers}


class FizzBuzzStep3Test extends FlatSpec with Matchers {

  "FizzBuzz generator for a given number" should "produce 'fizz' for multiples of 3" in {
    FizzBuzzStep3.generate(9) shouldBe "fizz"
  }

  "FizzBuzz generator for a given number" should "produce 'buzz' for multiples of 5" in {
    FizzBuzzStep3.generate(10) shouldBe "buzz"
  }

  "FizzBuzz generator for a given number" should "produce 'fizzbuzz' for if it is a multple of 15" in {
    FizzBuzzStep3.generate(15) shouldBe "fizzbuzz"
  }

  "FizzBuzz generator for a given number" should "produce string representation of a number if it is neither multiple of 3 nor 5" in {
    FizzBuzzStep3.generate(14) shouldBe "14"
  }

  "FizzBuzz generator for a given number" should "produce string 'lucky' if it contains a three" in {
    FizzBuzzStep3.generate(13) shouldBe "lucky"
  }

  "FizzBuzz generator for a range 1 to 20" should "produce valid a list of valid outputs for each number in range" in {
    FizzBuzzStep3.generate(1 to 20) shouldBe "1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz"
  }

}
