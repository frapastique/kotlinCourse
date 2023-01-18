/*
Schreibe hier deine Antwort hin.
        Banane
 */

// Beginn Programm
fun main() {
    // Eine veränderbare Liste (MutableList) fruechteListe mit vier Strings: "Zitrone", "Banane", "Ananas", "Trauben"
    val fruechteListe: MutableList<String> = mutableListOf("Zitrone", "Banane", "Ananas", "Trauben")
    // Variable lieblingsFrucht mit dem String "Erdbeere"
    var lieblingsFrucht: String = "Erdbeere"
    // for-Schleife wo von 3 bis 0 runtergezählt wird und jeweils als Variable i weiter gegeben wird
    for (i in 3 downTo 0) {
        // if Abfrage mit der Bedingung bzw. Abfrage ob in der Liste fruechteListe am Index i sich der String "Banane" befindet.
        // führe den Code-Block aus wenn am in der Liste fruechteListe Index i gleich "Banane" übergeben wird.
        if (fruechteListe[i] == "Banane") {
            // entspricht der aus der Liste ausgelesene Wert "Banane" dann wird die Variable lieblingsFrucht = "Erdbeere"
            // mit "Banane" überschrieben
            lieblingsFrucht = "Banane"
        }
    // Sobald die letzte Zahl bzw. Index übergeben und dessen Bedingung überprüft wurde, ist die for-Schleife beendet.
    }
    // In der Konsole den neuen Wert der Variable lieblingsFrucht ausgeben
    println(lieblingsFrucht)
}
// Ende des Programmes