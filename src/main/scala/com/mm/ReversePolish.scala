package com.mm

object ReversePolish {
  val digitRegex = "\\d+"
  val opRegex = "[+-]"

  def calc1(s: String):Int = {
    def go(s:List[String]):Int = {
      s match {
        case a::Nil => a.toInt
        case a::b::op::tail => go(fun(a.toInt, b.toInt)(op).toString ::tail)
      }
    }
    go(s.split("\\s+").toList)
  }


  def calc(s: String):Int = {
    def go(s:List[String], prev: List[Int]):Int = {
      s match {
        case Nil => prev.head
        case a::t if a.matches(digitRegex)=>
          go(t, a.toInt ::prev)
        case a::t if a.matches(opRegex) =>
          go(t, fun(prev(1), prev(0))(a) :: prev.drop(2))
      }
    }
    go(s.split("\\s+").toList, List.empty)
  }


  def fun(a:Int, b:Int)(op:String): Int = {
    if (op == "+")
      a + b
    else if (op == "-"){
      a - b
    }
    else
      0
  }

}
