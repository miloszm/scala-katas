package com.mmtest

import com.mm.PercentageOperator.PercentageOp
import org.scalatest.{FlatSpec, Matchers}

class PercentageOperatorTest extends FlatSpec with Matchers {

//  "PercentageOperator" should "calculate percentage on a number" in {
//    PercentageOperator.+%(120.0)(10.0) shouldBe (132)
//  }

  "PercentageOperator" should "calculate percentage on a number in infix notation" in {
    120.0 +% (10.0) shouldBe (132)
  }

}
