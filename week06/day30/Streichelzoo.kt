class Streichelzoo(var tiere: MutableList<Tier>) {
    fun allAnimalNoises(visitor: Besucher) {
        println("Ein Mensch mit dem Namen ${visitor.name} betritt den Streichelzoo.")
        for (i in this.tiere) {
            i.animalNoises()
        }
    }
    fun feedAllAnimals() {
        for (i in this.tiere) {
            i.feed("Zoowärter")
        }
    }
}