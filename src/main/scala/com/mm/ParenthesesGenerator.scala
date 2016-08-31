package com.mm


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

  def insertPair(c:String):List[String] = {
    val re = """(\(+|\))""".r
    val m = re.findAllMatchIn(c)
    (for (g <- m) yield {
      c.substring(0, g.start) + g.group(0) + "()" + c.substring(g.end)
    }).toList
  }

}
