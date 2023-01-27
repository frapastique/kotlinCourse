fun main () {
    val visitor0 = Besucher("Franz", 35)
    val visitor1 = Besucher("Sissi", 4)

    val animal0 = Tier("Helga", 35.3, 12, "weiblich")
    val sheep0 = Schaf("Shawn", 23.4, 5, "weiblich")
    val hen0 = Huhn("Kikeri", 2.5, 2, "weiblich", 2)
    val cow0 = Kuh("Berta", 525.0, 7, "weiblich", true)
    val pony0 = Pony("Gustav", 315.0, 3, "männlich", 30.5)

    visitor0.introduction()

    println(animal0.name)
    println(animal0.weight)
    println(animal0.age)
    println(animal0.gender)

    animal0.move()
    animal0.animalNoises()
    animal0.petting(visitor0.name)
    animal0.feed(visitor0.name)

    sheep0.animalNoises()

    hen0.animalNoises()
    println(hen0.egsPerDay)

    cow0.milking(visitor0.name)

    pony0.riding(visitor0.name, visitor0.age)
    pony0.riding(visitor1.name, visitor1.age)
}