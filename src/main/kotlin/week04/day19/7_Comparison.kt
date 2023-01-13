val list0: List<String> = listOf("Hans", "Zambi", "Visvaldis")
val list1: List<String> = listOf("Fronk", "Visvaldis", "Cedrik")
fun main() {
    compareValue(list0.random(), list1.random())
}

fun compareValue(value0: String, value1: String) {
    println("Es wird randomisiert verglichen:")
    if (value0 == value1) {
        println("$value0 und $value1 ist gleich!")
    } else {
        println("$value0 und $value1 ist nicht gleich!\n\nEs wird neu gezogen!\n")
        compareValue(list0.random(), list1.random())
    }
}