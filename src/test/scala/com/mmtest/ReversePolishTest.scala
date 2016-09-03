package com.mmtest

import com.mm.ReversePolish
import org.scalatest.{FlatSpec, Matchers}

class ReversePolishTest extends FlatSpec with Matchers {
  "RPN calulator" should "calculate expression 5 3 +" in {
    ReversePolish.calc("5 3 +") should be(8)
  }

  "RPN calulator" should "calculate expression 5 3 + 4 -" in {
    ReversePolish.calc("5 3 + 4 -") should be(4)
  }

}


