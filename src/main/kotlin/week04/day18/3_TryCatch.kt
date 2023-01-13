fun main() {
    try {
        buyItem()
    } catch (e: Exception) {
        println("Ein fehler ist aufgetreten: $e")
    }
}

fun buyItem() {
    val isInStock = false

    if (isInStock) {
        // buying item
    } else {
        // exception
        throw Exception("item not in stock exception")
    }
}