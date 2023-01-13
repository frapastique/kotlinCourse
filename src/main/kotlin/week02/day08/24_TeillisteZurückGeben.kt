fun main(){
    var bestenListe = listOf("Lisa", "Marko", "Sebastian", "Marie", "Florian", "Henrik", "Lillie", "Martin")
    // TODO : Schreibe eine main Funktion die zwei Zahlen als Eingaben vom Benutzer entgegennimmt.
    var indizeOne: Int ?
    print("Gebe eine Zahl an: ")
    indizeOne = readln().toInt()
    var indizeTwo: Int ?
    print("Gebe eine zweite Zahl an: ")
    indizeTwo = readln().toInt()

    // TODO : Die zwei Eingaben sollen als Idizes gewertet und für Anfang und Ende einer Teilliste der bestenListe stehen. (erstelle diese Teilliste) Tipp : <Listenname>.slice().
    var teilListe = bestenListe.slice(indizeOne .. indizeTwo)

    // TODO : Die Teilliste soll über einen println() befehl ausgegeben werden.
    println(teilListe)
}