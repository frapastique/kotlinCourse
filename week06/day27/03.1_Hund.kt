class Hund(var name: String, var age: Int, var race: String) {
    fun bellen() {
        println("$name: 'happy woof woof'")
    }
    fun aging() {
        age++
        if (age < 2) {
            println("Unser Hund $name der Rasse $race wird heute $age Jahr alt.")
        } else {
            println("Unser Hund $name der Rasse $race wird heute $age Jahre alt.")
        }
    }
}