package com.mmtest

import com.mm.RomanTranslator
import org.scalatest.{FlatSpec, Matchers}

class RomanTranslatorTest extends FlatSpec with Matchers {

  "Roman translator" should "translate roman I to alphanumeric" in {
    RomanTranslator.translate("I") should be (1)
  }

  "Roman translator" should "translate roman II to alphanumeric" in {
    RomanTranslator.translate("II") should be (2)
  }

  "Roman translator" should "translate roman III to alphanumeric" in {
    RomanTranslator.translate("III") should be (3)
  }

  "Roman translator" should "translate roman IV to alphanumeric" in {
    RomanTranslator.translate("IV") should be (4)
  }

  "Roman translator" should "translate roman V to alphanumeric" in {
    RomanTranslator.translate("V") should be (5)
  }

  "Roman translator" should "translate roman VI to alphanumeric" in {
    RomanTranslator.translate("VI") should be (6)
  }

  "Roman translator" should "translate roman VII to alphanumeric" in {
    RomanTranslator.translate("VII") should be (7)
  }
  "Roman translator" should "translate roman VIII to alphanumeric" in {
    RomanTranslator.translate("VIII") should be (8)
  }
  "Roman translator" should "translate roman IX to alphanumeric" in {
    RomanTranslator.translate("IX") should be (9)
  }
  "Roman translator" should "translate roman X to alphanumeric" in {
    RomanTranslator.translate("X") should be (10)
  }
  "Roman translator" should "translate roman LXXX to alphanumeric" in {
    RomanTranslator.translate("LXXX") should be (80)
  }
  "Roman translator" should "translate roman MCMXC to alphanumeric" in {
    RomanTranslator.translate("MCMXC") should be (1990)
  }
  "Roman translator" should "translate roman MCMLXXIII to alphanumeric" in {
    RomanTranslator.translate("MCMLXXIII") should be (1973)
  }

  "Roman translator" should "translate 10 to roman X" in {
    RomanTranslator.translateToRoman(10) should be ("X")
  }

  "Roman translator" should "translate 3 to roman III" in {
    RomanTranslator.translateToRoman(3) should be ("III")
  }

  "Roman translator" should "translate 4 to roman IV" in {
    RomanTranslator.translateToRoman(4) should be ("IV")
  }

  "Roman translator" should "translate 2008 to roman MMVIII" in {
    RomanTranslator.translateToRoman(2008) should be ("MMVIII")
  }

  "Roman translator" should "translate 5000 to roman MMMMM" in {
    RomanTranslator.translateToRoman(5000) should be ("MMMMM")
  }

}
