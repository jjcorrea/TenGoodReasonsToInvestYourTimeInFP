case class Item(name:String, price:Double)

def price(items:Seq[Item]): Double = items map(_.price) sum
def withTips(price:Double): Double = price+price*0.1
val totalPrice: (Seq[Item]) => Double = price _ andThen withTips _

totalPrice( Seq( Item("Ribs", 12.50), Item("Orange juice", 4.50) ) )
// res0: Double = 18.7
