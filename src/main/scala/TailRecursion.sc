import scala.annotation.tailrec

@tailrec def fibonacciTail(num: Int, nxt: Int, res: Int): Int = {
  num match {
    case 0 => res
    case _ => fibonacciTail(num-1, nxt+res, nxt)
  }
}
def fibonacci(num: Int) = fibonacciTail(num, 1, 0)

