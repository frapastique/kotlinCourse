class Huhn(name: String, weight: Double, age: Int, gender: String, val egsPerDay: Int): Tier(name, weight, age, gender) {
    override fun animalNoises() {
        println("${this.name}: ga-gack")
    }
}