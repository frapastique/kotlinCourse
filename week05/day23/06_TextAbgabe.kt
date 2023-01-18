/*
Schreibe hier deine Antwort hin.
        Oh cool, Keanu ist auch dabei!
        Wie es Michael wohl geht?
        Hey Lukas kommt!
 */

// Programm Start
fun main() {
    // Liste guests mit den Namen der Gäste als Strings
    val guests = listOf<String>("Paul", "Keanu", "Michael", "Hans", "Lukas", "Marko")
    // for-Schleife welche über die Zahlen 0 bis größe der Liste -1 iteriert (6-1=5) somit 0, 1, 2, 3, 4, 5
    // und den jeweils den entsprechenden Integer als Variable i übergibt.
    for (i in 0..guests.size - 1) {
        // if Bedingung, wenn in der Liste am Index i "Lukas" übergeben wird, wird der code Block ausgeführt
        if (guests[i] == "Lukas") {
            // Trifft die Bedingung ist-gleich "Lukas" zu, wird "Hey Lukas kommt!" ausgegeben
            println("Hey Lukas kommt!")
        }
        // if Bedingung, wenn in der Liste am Index i "Keanu" übergeben wird, wird der code Block ausgeführt
        if (guests[i] == "Keanu") {
            // Trifft die Bedingung ist-gleich "Keanu" zu, wird "Oh cool, Keanu ist auch dabei!" ausgegeben
            println("Oh cool, Keanu ist auch dabei!")
        }
        // if Bedingung, wenn in der Liste am Index i "Michael" übergeben wird, wird der code Block ausgeführt
        if (guests[i] == "Michael") {
            // Trifft die Bedingung ist-gleich "Michael" zu, wird "Wie es Michael wohl geht?" ausgegeben
            println("Wie es Michael wohl geht?")
        }
    // Die for-Schleife wird beendet, sobald über alle zuvor festgelegte Integer iteriert und dessen if-Bedingungen
    // überprüft wurden.
    }
}
// Ende des Programmes