class Kuh(name: String, weight: Double, age: Int, gender: String, val producesMilk: Boolean): Tier(name, weight, age, gender) {
    override fun animalNoises() {
        super.animalNoises()
        println("Muuuh")
    }
    fun milking(nameVisitor: String) {
        if (producesMilk) {
            println("$nameVisitor melkt die Kuh ${this.name}.")
        } else {
            println("Achtung $nameVisitor! Die Kuh ${this.name} ist ${this.gender} und gibt keine Milch.")
        }
    }
}