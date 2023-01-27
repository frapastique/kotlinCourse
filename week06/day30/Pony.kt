class Pony(name: String, weight: Double, age: Int, gender: String, val speed: Double): Tier(name, weight, age, gender) {
    override fun animalNoises() {
        println("${this.name}: Wiehiehie")
    }
    fun riding(visitor: Besucher) {
        if (this.age >= 1) {
            if (visitor.age >= 6) {
                println("${visitor.name} reitet ${this.name}.")
            } else {
                println("Das Mindestalter beträgt 6 Jahre.")
                println("${visitor.name} ist mit ${visitor.age} Jahren zu jung um ${this.name} zu reiten.")
            }
        } else {
            println("Der Pony ${this.name} ist mit ${this.age} zu jung um geritten zu werden.")
        }
    }
}