package com.mm

object RomanTranslator {
  def translateToRoman(i: Int):String = {
    findRomanFromInt(i) match {
      case Some((s,v)) => s + translateToRoman(i - v )
      case None => ""
    }
  }


  val map:Map[String,Int] = Map("I" -> 1, "IV" -> 4, "V" -> 5, "IX" -> 9, "X" -> 10,
    "XL" -> 40, "L" -> 50, "XC" -> 90, "C" -> 100, "CD" -> 400, "D" -> 500,
    "CM" -> 900, "M" -> 1000)

  private def findRomanFromInt(i: Int): Option[(String,Int)] = {
    val sortedKeys = map.toList.sortWith((a,b) => a._2 > b._2)
    sortedKeys.dropWhile(r => r._2 > i).headOption
  }



  def translate(s: String):Int = {

    findRoman(s) match {
      case Some(r) => map.getOrElse(r, 0) + translate(s.substring(r.length))
      case None => 0
    }
  }

  private def findRoman(s: String): Option[String] = {
    val sortedKeys = map.keySet.toList.sortWith((a,b) => a.length < b.length).reverse
    sortedKeys.dropWhile(r => !s.startsWith(r)).headOption
  }

//  yield {
//    s match {
//      case "II" => 2
//      case "III" => 3
//      case "VI" => 6
//      case "VII" => 7
//      case "VIII" => 8
//    }
//  }


}
