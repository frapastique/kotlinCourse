fun main() {
    val numbers: List<Int> = listOf(62, 34, 364, 235, 57, 68, 2, 325, 6, 42, 7, 57, 3, 246, 24, 62, 46, 7346, 34)

    for (i in numbers) {
        if (i == 42){
            println("Zahl gefunden.")
            break
        }
    }
}