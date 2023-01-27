class Streichelzoo(var tiere: MutableList<Tier>) {
    fun allAnimalNoises() {
        for (i in this.tiere) {
            i.animalNoises()
        }
    }
    fun feedAllAnimals(feederName: String) {
        for (i in this.tiere) {
            i.feed(feederName)
        }
    }
    fun ponyRace(pony0: Pony, pony1: Pony) {
        val speed0 = pony0.speed
        val speed1 = pony1.speed
        println("""
            Willkommen zum Pony rennen.
            
            Der Pony ${pony0.name} und ${pony1.name} treten gegeneinander an.
            
            """.trimIndent())
        if (speed0 > speed1) {
            println("${pony0.name} gewinnt das Rennen!")
        } else {
            println("${pony1.name} gewinnt das Rennen!")
        }
    }
}