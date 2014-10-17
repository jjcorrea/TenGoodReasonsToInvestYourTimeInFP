val javaList = new java.util.ArrayList[Int]()
javaList.add(1)
javaList.add(2)
javaList.add(3)
println(javaList)
// [1, 2, 3]
val scalaList = List(1, 2, 3)
scalaList.add(4)
<console>:12: error: value add is not a member of List[Int]
  scalaList.add(4)
  ^
  println(scalaList :+ 4)
  // List(1, 2, 3, 4)
  println(scalaList)
  // List(1, 2, 3)


