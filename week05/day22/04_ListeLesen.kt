fun main() {
    val fruits: List<String> = listOf("Strawberry", "Apple", "Banana", "Lemon")

    for (fruit in fruits) {
        println(fruit)
    }

    var i: Int = 0
    do {
        println(fruits[i])
        i++
    } while (i < fruits.size)
}