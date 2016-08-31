

val re = """(a+|b)""".r
val s = "aaabaa"
val r = re.findAllMatchIn(s)
val l = r.toList
val g = l(0)
val ss = g.group(0)
val x = g.groupCount
val b = g.start
val e = g.end


