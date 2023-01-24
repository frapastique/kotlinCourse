fun main() {
    var person0: Person = Person("Franz Maier", 28)
    var person1: Person = Person("Jana Mueller", 53)
    var person2: Person = Person("Tanja Baecker", 32)

    println("Name:  ${person0.name}\nAlter: ${person0.age}\n")
    println("Name:  ${person1.name}\nAlter: ${person1.age}\n")
    println("Name:  ${person2.name}\nAlter: ${person2.age}")
}