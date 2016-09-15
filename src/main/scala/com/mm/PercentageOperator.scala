package com.mm

object PercentageOperator {
  implicit class PercentageOp(d:Double){
    def +%(n:Double):Double = {
      d * (1 + n/100)
    }
  }
}

