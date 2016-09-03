package com.mmtest

import com.mm.MultiTree
import com.mm.MultiTree.Node
import org.scalatest.{FlatSpec, Matchers}

class MultiTreeTest extends FlatSpec with Matchers {

  "String representation zipper" should "zip string representation with current level" in {
    MultiTree.stringZipper("abc^^d^ef^g^^^") should contain theSameElementsAs
    List(('a',-1),('b',-2),('c',-3),('^',-2),('^',-1),('d',-2),('^',-1),('e',-2),('f',-3),('^',-2),('g',-3),('^',-2),('^',-1),('^',0))
  }

  "Split at" should "split properly" in {
    MultiTree.splitAt(MultiTree.stringZipper("abc^^d^ef^g^^^"),-2) should contain theSameElementsAs
    List(List(('b',-2), ('c',-3), ('^',-2), ('^',-1)), List(('d',-2), ('^',-1)), List(('e',-2), ('f',-3), ('^',-2), ('g',-3), ('^',-2), ('^',-1)))
  }

  "String to tree" should "convert string representation to tree" in {
    MultiTree.stringToTree("abc^^d^ef^g^^^") should be (Node('a',List(Node('b',List(Node('c',List()))), Node('d',List()), Node('e',List(Node('f',List()), Node('g',List()))))))
  }
}
