fun main() {
    val wochentage: MutableList<String> = mutableListOf("Montag", "Dienstag", "Mittwoch")
    // todo: Erweitere ab hier den Code.
    wochentage.add("Donnerstag")
    println(wochentage)
    wochentage.add("Freitag")
    println(wochentage)
    wochentage.add("Samstag")
    println(wochentage)
    wochentage.add("Sonntag")
    println(wochentage)
    println(wochentage.size)
    wochentage.clear()
    println("[]")
    println(wochentage) // []
}