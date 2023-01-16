fun main() {
    var numbers: List<Int> = listOf(1, 2, 3, 4)
    var number: Int
    try {
        number = numbers[10]
    } catch (e: Exception) {
        println("Die Liste besteht aus 4 Zahlen, versucht wurde jedoch 10. Variable \"number\" wurde auf -1 gesetzt.")
        number = -1
    }
}