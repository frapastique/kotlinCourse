class Kuh(name: String, weight: Double, age: Int, gender: String, val producesMilk: Boolean): Tier(name, weight, age, gender) {
    override fun animalNoises() {
        println("${this.name}: Muuuh")
    }
    fun milking(nameVisitor: String) {
        if (producesMilk && age > 3) {
            println("$nameVisitor melkt die Kuh ${this.name}.")
        } else if (producesMilk && age <= 3) {
            println("Achtung $nameVisitor! Die Kuh ${this.name} ist mit ${this.age} Jahren zu jung um Milch zu produzieren.")
        } else {
            println("Achtung $nameVisitor! Die Kuh ${this.name} ist ${this.gender} und gibt keine Milch.")
        }
    }
}