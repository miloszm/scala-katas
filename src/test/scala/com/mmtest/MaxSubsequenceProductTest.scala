package com.mmtest

import com.mm.MaxSubsequenceProduct
import org.scalatest.{FlatSpec, Matchers}

class MaxSubsequenceProductTest extends FlatSpec with Matchers{

  "MaxSubsequenceProduct" should "find max product if n is equal to length of the list" in {
    MaxSubsequenceProduct.findMaxProduct(2, List(2,3)) shouldBe (6)
  }

  "MaxSubsequenceProduct" should "find max product" in {
    MaxSubsequenceProduct.findMaxProduct(2, List(1,2,3,4)) shouldBe (12)
  }

  "MaxSubsequenceProduct" should "find max product 2" in {
    MaxSubsequenceProduct.findMaxProduct(2, List(-9,-9, 2, 3)) shouldBe (81)
  }

  "MaxSubsequenceProduct" should "find max product with single negative" in {
    MaxSubsequenceProduct.findMaxProduct(2, List(-9, 9, 2, 3)) shouldBe (18)
  }

  //  "Slice products " should "find all partial products" in {
//    MaxSubsequenceProduct.sliceProducts(List(1,2,3)) theSameElementsAs (List(1,2,6))
//  }


}
