fun main () {
    val list : List<String> = listOf("Hallo", "Welt", "!", "Was", "für", "ein", "schöner", "Tag", "!")
    //Erstelle unter diesem Kommentar eine Schleife, die die Liste oben auslesen kann
    var i: Int = 0
    while (i < list.size) {
        println(list[i])
        i++
    }
}