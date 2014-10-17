val a:Option[Int] = Some(5)
val b:Option[Int] = None

a.getOrElse(0)
// res0: Int = 5

b.getOrElse(10)
// res1: Int = 10