// regular map
Seq(1,2,3).map(_+1)
//res0: Seq[Int] = List(2, 3, 4)

// parallel map
Seq(1,2,3).par.map(_+1)
// res1: scala.collection.parallel.ParSeq[Int] = ParVector(2, 3, 4)