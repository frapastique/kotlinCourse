fun main() {
    val numbers: List<Int> = listOf(34, 42, 235, 42, 42, 24, 42, 42, 7346, 34)

    for (i in numbers) {
        if (i == 42) {
            continue
        } else {
            println(i)
        }
    }
}