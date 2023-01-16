fun main() {
//    val a: List<Double> = listOf(2.3, 5.4, 6.8)
//    val b: Double = a.min()
    /* TODO Erstelle zwei Listen mit warenNamen = "Schokoriegel", "Wassereis", "Zeitung"
                                     warenPreis = 1.29, 0.49, 1.99 */
    var warenNamen: MutableList<String> = mutableListOf("Schokoriegel", "Wassereis", "Zeitung")
    var warenPreis: MutableList<Double> = mutableListOf(1.29, 0.49, 1.99)

    /* TODO Zeige Peter was sich in deinem Sortiment befindet */
    println("Hallo Peter in meinem Sortiment befinden sich aktuell:\n\n" +
            "${warenNamen[0]} für ${warenPreis[0]}€\n" +
            "${warenNamen[1]} für ${warenPreis[1]}€\n" +
            "${warenNamen[2]} für ${warenPreis[2]}€\n")

    /* TODO Gebe Peter die Möglichkeit einen Preis für einen gelisteten Artikel zu wiederholen. */
    var erneuteAbfrage: String ?
    println("Für welchen Artikel soll ich den Preis Wiederholen?")
    erneuteAbfrage = readln()

    while (!warenNamen.contains(erneuteAbfrage)) {
        println("Peter! Diesen Artikel führen wir nicht!")
        println("\nFür welchen Artikel soll ich den Preis wiederholen?")
        erneuteAbfrage = readln()
    }

    var index = warenNamen.indexOf(erneuteAbfrage)
    println("\n${warenNamen[index]} kostet ${warenPreis[index]}€")

    /* TODO Im Hintergrund fügt Alfred meinem Sortiment Kaugummi für 0.19€ hinzu */
    warenNamen.add("Kaugummi")
    warenPreis.add(0.19)
    println("\nSoeben hat Alfred mein Sortiment aktualisiert. Nun Verkaufe ich:\n\n" +
            "${warenNamen[0]} für ${warenPreis[0]}€\n" +
            "${warenNamen[1]} für ${warenPreis[1]}€\n" +
            "${warenNamen[2]} für ${warenPreis[2]}€\n" +
            "${warenNamen[3]} für ${warenPreis[3]}€\n")

    /* TODO Peter fragt erneut nach dem Preis eines Artikels */
    println("Für welchen Artikel soll ich den Preis Wiederholen?")
    erneuteAbfrage = readln()

    while (!warenNamen.contains(erneuteAbfrage)) {
        println("Peter! Diesen Artikel führen wir nicht!")
        println("\nFür welchen Artikel soll ich den Preis wiederholen?")
        erneuteAbfrage = readln()
    }

    index = warenNamen.indexOf(erneuteAbfrage)
    println("\n${warenNamen[index]} kostet ${warenPreis[index]}€\n")

    /* TODO Peter kauft 10x Kaugummi, 5x Wassereis und 3 Schokoriegel. Zahlt mit 20€ und erhält den Rest */
    var gesamtPreis: Double = 10.times(warenPreis[3]).plus(5.times(warenPreis[1]).plus(3.times(warenPreis[0])))
    var restGeld: Double = 20.minus(gesamtPreis)
    println("Der gesamt Preis beträgt: $gesamtPreis€ und für deine 20€ bekommst du somit $restGeld€ raus.\n" +
            "Vielen dank für deinen Einkauf und bis zum nächsten mal!\n")

    /* TODO Wassereis aus dem Sortiment nehmen */
    warenNamen.remove("Wassereis")
    warenPreis.remove(0.49)

    /* TODO Günstigste Ware anzeigen */
    index = warenPreis.indexOf(warenPreis.min())
    println("Der günstigste Artikel ist ${warenNamen[index]} für ${warenPreis[index]}€!")
}