class Schaf(name: String, weight: Double, age: Int, gender: String): Tier(name, weight, age, gender) {
    override fun animalNoises() {
        println("${this.name}: määäh")
    }
}