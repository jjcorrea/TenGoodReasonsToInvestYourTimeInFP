import java.util.Arrays
import javasamples.Sale

var sales: List[Sale] = Arrays.asList(new Sale("salesman 1", "client 1", 200.0), new Sale("salesman 1", "client 2", 100.0), new Sale("salesman 2", "client 3", 300.0), new Sale("salesman 2", "client 4", 50.0), new Sale("salesman 3", "client 5", 10.0))

// scala
def sumSales(sales: Seq[Sale]): Double = sales.map(_.value).sum
sales.groupBy(_.salesman).map(s => s._1 -> sumSales(s._2))
