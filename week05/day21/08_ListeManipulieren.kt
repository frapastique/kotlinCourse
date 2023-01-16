fun main() {
    var list: MutableList<Int> = mutableListOf(0, 1, 2, 3, 4, 5)
    //Implementiere unter diesem Kommentar die in der Aufgabe beschriebene while-Schleife
    println(list)
    var i: Int = 0
    while (i < list.size) {
        list.set(i, (list[i].times(2)))
        i++
    }
    println(list)
}