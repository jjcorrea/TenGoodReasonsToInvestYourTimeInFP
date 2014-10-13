// regular fold
(1 to 1000000).fold(0)(_ + _)
// res0: Int = 1784293664

// parallel fold
(1 to 1000000).par.fold(0)(_ + _)
// res1: Int = 1784293664

(1 to 100).par.map(_+1)

