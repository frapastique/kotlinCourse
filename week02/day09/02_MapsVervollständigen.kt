fun main() {
    // Hier ist eine Map die eine Person zu (to) einer Telefonnummer gemappt (Abbildet, zeigt).
    // Der Schlüssel hat dabei den Typ String und der Wert hat den Typ Int.
    val personZuTelefonnummer: Map<String, Int> = mapOf(
        "Ferdinand" to 16520335,
        "Gert" to 35872901,
        "Hilde" to 35489832,
    )

    // todo: Vervollständige die nächste map, sodass sie zu Beginn diese Paare hat:
    //  "Peter" -> 2487503
    //  "Bernd" -> 3465081
    //  "Ludolf" -> 3985ß29
    val telefonNummerListe: Map<String, Int> = mapOf(
        "Peter" to 2487503,
        "Bernd" to 3465081,
        "Ludolf" to 3985029,
    )

    // todo: Vervollständige die nächste map, sodass der Schlüssel vom Typ String und der Wert vom Typ Int ist.
    //  Zusätzlich hat die Map zu Beginn diese Paare:
    //  "Mara" -> 3468789
    //  "Tina" -> 9834620
    //  "Lorelei" -> 4698302
    val stringZuInt: Map<String, Int> = mapOf(
        "Mara" to 3468789,
        "Tina" to 9834620,
        "Lorelei" to 4698302,
    )

    // todo: Gebe jede Map aus und schau sie dir an, merkst du Ähnlichkeiten zu Listen?
    println(personZuTelefonnummer)
    println(telefonNummerListe)
    println(stringZuInt)
}