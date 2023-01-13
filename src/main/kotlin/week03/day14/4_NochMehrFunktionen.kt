fun main() {
    printCity("Berlin")
    printCity("Duisburg")
    printCity("Frankfurt")
}

fun printCity(city: String) {
    var mutableListOfCities: MutableList<String> = mutableListOf("Köln", "Hamburg",)
    mutableListOfCities.add(city)
    println(mutableListOfCities)
}