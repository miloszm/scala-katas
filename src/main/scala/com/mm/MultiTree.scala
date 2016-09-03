package com.mm

object MultiTree {

  case class Node(c:Char, children:List[Node])

  def stringZipper(s: String):List[(Char,Int)] = {
    def arrowDiscriminator(c:Char):Int = if (c == '^') 1 else -1
    def go(s:String, acc:List[(Char,Int)],level:Int):List[(Char,Int)] = s match {
      case "" => acc
      case s => go(s.substring(1), acc ::: List((s.charAt(0),level + arrowDiscriminator(s.charAt(0)))), level + arrowDiscriminator(s.charAt(0)))
    }
    go(s, List(), 0)
  }

  def isArrow(c:Char) = c == '^'

  def splitAt(ss:List[(Char,Int)], level:Int):List[List[(Char,Int)]] = {
    val indices = for {
      i <- 0 until ss.size
      if (ss(i)._2 == level && !(isArrow(ss(i)._1))) || i == ss.size-1
    } yield i

    val slices = for {
      (f,t) <- indices.zip(indices.drop(1))
    } yield ss.slice(f,t)

    slices.toList
  }

  def processChunk(ss:List[(Char,Int)], level:Int):Node = Node(ss.head._1, processRestOfChunk(ss.drop(1), level))

  def processRestOfChunk(ss:List[(Char,Int)], level:Int): List[Node] = {
    if (ss.forall(e => isArrow(e._1))) Nil
    else {
      val chunks = splitAt(ss, level-1)
      val nodes = for {
        chunk <- chunks
      } yield processChunk(chunk, level-1)
      nodes
    }
  }

  def stringToTree(s:String): Node = {
    processChunk(stringZipper(s),-1)
  }

}
