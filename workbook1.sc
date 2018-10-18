
val level = Vector(Vector('a','b'), Vector('S','T'), Vector('o','o'))

def findCharFunc(c: Char, levelVector: Vector[Vector[Char]]): (Int,Int) = {
  val x = for {
    i <- levelVector.indices
    j = levelVector(i).indexOf(c)
    if (j >= 0)
  } yield (i, j)
  println(x)
  if (x.size == 0) (0,0) else x(0)
}

def findCharImp(c: Char, levelVector: Vector[Vector[Char]]): (Int,Int) = {
  var i: Int = -1
  var j: Int = 0
  do {
    i = i + 1
    j = levelVector(i).indexOf(c)
  }
  while ((i < levelVector.size) && (j < 0))
  println(i)
  println(j)
  (i, j)
}

val c = 'o'
val x = findCharFunc(c, level)
val y = findCharImp(c, level)
val l = List((1, 'a'), (2, 'b'), (3,'c'))
val n = l.filter(_._1  > 1)
println(n)
val stream = 1 #:: 2 #:: 3 #:: Stream.empty

stream.take(3)

println(stream.take(3))

val s1: Stream[Int] = Stream(1,2,3)
Stream(s1.head)


