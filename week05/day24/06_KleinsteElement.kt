fun main() {
    val numbers = listOf(
        35, 35, 37, 246, 246, 357, 234, 4237, 476, 2346, 24, 347, 357, 67,
        52315, 346, 3567, 346, 235, 26, 357, 486, 457, 246, 246, 3247,
        35, 247, 2437, 274, 374, 35, 634, 35, 37, 2436, 43
    )
    println(numbers)
    println("Zur Kontrolle: ${numbers.min()}")
    var smallest: Int = smallestNumber(numbers)
    if (numbers.min() == smallest) {
        println("Die Zahl '$smallest' ist kleinste Zahl der Liste.")
    } else {
        println("Die Zahl '$smallest}' ist nicht die kleinste Zahl der Liste.")
    }
}

fun smallestNumber(liste: List<Int>): Int {
    var smallest: Int = liste[0]
    for (i in liste.indices) {
        if (smallest > liste[i]) {
            smallest = liste[i]
        }
    }
    return smallest
}