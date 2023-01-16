fun main() {
    /*
        Wir haben eine Liste mit Namen und wollen wissen, ob sich der Name "Walter" in der Liste befindet.
        Erstelle eine neue Boolean-Variable, die uns zeigt, ob sich der Name in der Liste befindet.
        Benutze dafür die in der Vorlesung vorgestelle Methode.
     */
    var names: MutableList<String> = mutableListOf("Jimmy", "Hank", "Jesse", "Walter", "Marie", "Skyler")
    //TODO füge hier deinen Code ein
    var namesContainWalter = names.contains("Walter")
    println(namesContainWalter)
}