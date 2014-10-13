// returning fn
case class Vehicle(brand:String, wheels:Int, seats:Int, model:String)

val bmwCar: (String) => Vehicle = Vehicle("BMW", 4, 5, _:String)
val bmwMotorcycle: (String) => Vehicle = Vehicle("BMW", 2, 2, _:String)

bmwCar("M3")
// res0: Vehicle = Vehicle(BMW,4,5,M3)

bmwMotorcycle("G650X")
// res1: Vehicle = Vehicle(BMW,2,2,G650X)
