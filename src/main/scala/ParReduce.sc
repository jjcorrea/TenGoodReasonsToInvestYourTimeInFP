// regular reduce
Seq(1,2,3).reduce(_+_)
//res0: Int = 6

// parallel reduce
Seq(1,2,3).par.reduce(_+_)
// res1: Int = 6


