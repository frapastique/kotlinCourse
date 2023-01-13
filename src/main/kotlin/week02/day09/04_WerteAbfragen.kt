fun main() {
    // In dieser Aufgabe geht es darum, wie man Werte aus einer Map erhält. Oftmals hat man einen Schlüssel (key) gegeben und möchte den Wert (value) haben, auf den der Schlüssel zeigt.
    /*
    TODO: a) Gegeben ist folgende Map:
        Die Map mappt von Person zu ihrem Lieblingstier.
            val personZuHaustier: Map<String, String> = mapOf(
                "Berta" to "Hunde",
                "Frank" to "Katzen",
                "Luis" to "Mäuse",
                "Sylvia" to "Eulen",
                "Hans" to "Pfauen",
            )
        - Verwende die Funktion get() oder die Index[] Schreibweise, wie in Aufgabe 1 oder in der Vorlesung gezeigt.
            - Was ist das Lieblingstier von Frank?
            - Was ist das Lieblingstier von Sylvia?
            - Was ist das Lieblingstier von Hans?
    */
    val personZuHaustier: Map<String, String> = mapOf(
        "Berta" to "Hunde",
        "Frank" to "Katzen",
        "Luis" to "Mäuse",
        "Sylvia" to "Eulen",
        "Hans" to "Pfauen",
    )
    println("Das Lieblingstier von Frank sind ${personZuHaustier["Frank"]}.")
    println("Das Lieblingstier von Sylvia sind ${personZuHaustier["Sylvia"]}.")
    println("Das Lieblingstier von Hans sind ${personZuHaustier["Hans"]}.")

    //personZuHaustier.forEach {person, haustier ->
    //    println("Das Lieblingstier von $person sind $haustier")
    //}

    /*
    TODO: b) Gegeben ist folgende Map:
        Die Map mappt von Hausnummer zu Hausfarbe.
                12 to "Rot",
                45 to "Blau",
                23 to "Gelb",
                28 to "Grün",
                36 to "Lila",
                92 to "Rosa",
        - Erstelle eine geeignete Map mit den genannten Paaren.
        - Lese den Wert aus der Map aus und weise ihn einer Variable zu, gib dann die Variable in der Konsole aus.
        - Verwende in deiner Lösung die Funktion get() oder die Index[] Schreibweise.
            - Welche Hausfarbe hat das Haus mit der Nummer 28?
            - Welche Hausfarbe hat das Haus mit der Nummer 45?
            - Welche Hausfarbe hat das Haus mit der Nummer 92?
            - Welche Hausfarbe hat das Haus mit der Nummer 12?
     */
    val hausnummerZuHausfarbe: Map<Int, String> = mapOf(
        12 to "Rot",
        45 to "Blau",
        23 to "Gelb",
        28 to "Grün",
        36 to "Lila",
        92 to "Rosa",
    )
    val hausfarbe28 = hausnummerZuHausfarbe[28]
    println("Das Haus mit der Nummer 28 hat die Farbe $hausfarbe28.")
    val hausfarbe45 = hausnummerZuHausfarbe[45]
    println("Das Haus mit der Nummer 45 hat die Farbe $hausfarbe45.")
    val hausfarbe92 = hausnummerZuHausfarbe[92]
    println("Das Haus mit der Nummer 92 hat die Farbe $hausfarbe92.")
    val hausfarbe12 = hausnummerZuHausfarbe[12]
    println("Das Haus mit der Nummer 12 hat die Farbe $hausfarbe12.")
}