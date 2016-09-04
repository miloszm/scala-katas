package com.ce

import com.ce.FizzBuzzStep3.OutputType
import org.scalatest.{FlatSpec, Matchers}


class FizzBuzzStep3Test extends FlatSpec with Matchers {

  "FizzBuzz generator for a given number" should "produce 'fizz' and output type 'fizz' for multiples of 3" in {
    FizzBuzzStep3.generate(9) shouldBe ("fizz", OutputType.fizz)
  }

  "FizzBuzz generator for a given number" should "produce 'buzz' and output type 'buzz' for multiples of 5" in {
    FizzBuzzStep3.generate(10) shouldBe ("buzz", OutputType.buzz)
  }

  "FizzBuzz generator for a given number" should "produce 'fizzbuzz' and output type 'fizzbuzz' for if it is a multple of 15" in {
    FizzBuzzStep3.generate(15) shouldBe ("fizzbuzz", OutputType.fizzbuzz)
  }

  "FizzBuzz generator for a given number" should "produce string representation of a number and output type 'integer' if it is not multiple of 3 or 5 or both" in {
    FizzBuzzStep3.generate(14) shouldBe ("14", OutputType.integer)
  }

  "FizzBuzz generator for a given number" should "produce 'lucky' and output type 'lucky' if it contains a three" in {
    FizzBuzzStep3.generate(13) shouldBe ("lucky", OutputType.lucky)
  }

  "FizzBuzz generator for a range 1 to 20" should "produce valid a list of outputs for each number in range followed by a statistics section" in {
    FizzBuzzStep3.generate(1 to 20) shouldBe
      "1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz\nfizz: 4\nbuzz: 3\nfizzbuzz: 1\nlucky: 2\ninteger: 10"
  }

}
