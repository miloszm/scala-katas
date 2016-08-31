package com.mm

import scala.collection.mutable.ListBuffer


/**
  * 31/08/2016
  */
object ParenthesesGenerator {
  def combinations(n: Int):List[String] = n match {
    case 0 => Nil
    case 1 => List("()")
    case n => insertPair(combinations(n-1))
  }

  def insertPair(list:List[String]):List[String] = {
    val combinations = for {
      c <- list
    }
    yield {
      insertPair(c)
    }
    combinations.flatten.distinct
  }

  def insertPair(c:String):Set[String] = {
    val re = """(\(+|\))""".r
    val m = re.findAllMatchIn(c)
    (for (g <- m) yield {
      c.substring(0, g.start) + g.group(0) + "()" + c.substring(g.end)
    }).toSet
  }


  def combinations2(n: Int):List[String] = {
    val list = ListBuffer[String]()
    def go(l:Int, r:Int, current:String):Unit = {
      if ((l,r) == (0,0))
        list += current
      else {
        if (l > 0)
          go(l - 1, r, current + '(')
        if (r > l)
          go(l, r - 1, current + ')')
      }
    }
    go(n,n,"")
    list.toList
  }

}
