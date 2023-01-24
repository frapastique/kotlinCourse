class Hund(var name: String, var age: Int, var race: String) {
    fun bellen() {
        println("woof woof")
    }
    fun aging() {
        age++
        println("Unser Hund $name der Rasse $race wird heute $age Jahre alt")
    }
}