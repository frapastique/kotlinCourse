class Pony(name: String, weight: Double, age: Int, gender: String, val speed: Double): Tier(name, weight, age, gender) {
    override fun animalNoises() {
        super.animalNoises()
        println("Wiehiehie")
    }
    fun riding(visitorName: String, visitorAge: Int) {
        if (this.age >= 1) {
            if (visitorAge >= 6) {
                println("$visitorName reitet ${this.name}.")
            } else {
                println("Das Mindestalter beträgt 6 Jahre.")
                println("$visitorName ist mit $visitorAge Jahren zu jung um ${this.name} zu reiten.")
            }
        } else {
            println("Der Pony ${this.name} ist mit ${this.age} zu jung um geritten zu werden.")
        }
    }
}