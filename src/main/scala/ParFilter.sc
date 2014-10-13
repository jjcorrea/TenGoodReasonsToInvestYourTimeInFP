// regular filter
Seq("Smith","Jones","Rodin").filter(_.head == 'J')
// res0: Seq[String] = List(Jones)

// parallel filter
Seq("Smith","Jones","Rodin").par.filter(_.head == 'J')
//res1: scala.collection.parallel.ParSeq[String] = ParVector(Jones)
