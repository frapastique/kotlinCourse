class Huhn(name: String, weight: Double, age: Int, gender: String, egsPerDay: Int): Tier(name, weight, age, gender) {
    override fun animalNoises() {
        super.animalNoises()
        println("ga-gack")
    }
}