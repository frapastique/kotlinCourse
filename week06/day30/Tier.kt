open class Tier(val name: String, var weight: Double, val age: Int, val gender: String) {
    fun move() {
        println("Die $name hat sich bewegt.")
    }
    open fun animalNoises() {
        println("Tier geräusch:")
    }
    fun petting(visitorName: String) {
        println("$visitorName streichelt ${this.name}.")
    }
    fun feed(feederName: String) {
        weight = weight.times(1.02)
        println("$feederName füttert ${this.name}. Nun wiegt es ${this.weight}.")
    }
}