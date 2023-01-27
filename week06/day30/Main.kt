fun main () {
    val visitor0 = Besucher("Franz", 35)

    val animal0 = Tier("Helga", 35.3, 12, "weiblich")
    val sheep0 = Schaf("Shawn", 23.4, 5, "weiblich")

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
}