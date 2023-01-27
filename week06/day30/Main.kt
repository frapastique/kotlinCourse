fun main () {
    val visitor0 = Besucher("Franz", 35)
    val visitor1 = Besucher("Sissi", 4)

    val sheep0 = Schaf("Shawn", 23.4, 5, "weiblich")
    val sheep1 = Schaf("Peter", 30.4, 6, "männlich")
    val hen0 = Huhn("Kikeri", 2.5, 2, "weiblich", 2)
    val hen1 = Huhn("Sigi", 3.5, 2, "männlich", 0)
    val cow0 = Kuh("Berta", 525.0, 7, "weiblich", true)
    val cow1 = Kuh("Friedhelm", 600.0, 5, "männlich", false)
    val pony0 = Pony("Gustav", 315.0, 3, "männlich", 30.5)

    var streichelzoo = Streichelzoo(mutableListOf(sheep0, sheep1, hen0, hen1, cow0, cow1, pony0))

    streichelzoo.allAnimalNoises(visitor0)
}