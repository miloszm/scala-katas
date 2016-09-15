package com.mm

object MaxSubsequenceProduct {
  def findMaxProduct(n: Int, initialList: List[Int]): Int = {
    def go(list: List[Int], currentMax: Int, prev:Int, firstIndex:Int): Int = list match {
      case Nil => currentMax
      case h :: t =>
        val newValue: Int = prev * h / initialList(firstIndex)
        go(t, math.max(currentMax,newValue), newValue, firstIndex+1)
    }
    val initialProduct: Int = initialList.take(n).product
    go(initialList.drop(n), initialProduct, initialProduct, 0)
  }
}

