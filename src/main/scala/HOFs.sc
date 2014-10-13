// takes a fn as argument
case class Person(age:Int)
def underAge(person: Person) = person.age < 18
Seq(Person(10), Person(20)).filter(underAge)

// anonymously
Seq(Person(10), Person(20)).filter((person: Person) => person.age < 18)

// with some sugar
Seq(Person(10), Person(20)).filter(_.age < 18)