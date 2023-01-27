fun main () {
    val visitor0 = Besucher("Franz", 35)

    val animal0 = Tier("Helga", 35.3, 12, "weiblich")

    visitor0.introduction()

    println(animal0.name)
    println(animal0.weight)
    println(animal0.age)
    println(animal0.gender)
}