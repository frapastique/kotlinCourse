fun main() {
    var lieblingsFilme: List<String> = listOf("Batman", "Frankenstein", "Jurassic Park", "Matrix", "Harry Potter")
    val searchString: String = "Matrix"

    for (matrix in lieblingsFilme) {
        if (matrix == searchString) {
            println("Ja, der Film $searchString ist an der Stelle ${lieblingsFilme.indexOf(searchString)} in der Liste.")
        }
    }

    var found: Boolean = false
    var i: Int = 0
    do {
        if (lieblingsFilme[i] == searchString) {
            println("Ja, der Film $searchString ist an der Stelle ${lieblingsFilme.indexOf(searchString)} in der Liste.")
            found = true
        }
        i++
    } while (i < lieblingsFilme.size && !found)
}