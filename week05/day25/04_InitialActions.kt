fun mischen(deck: MutableList<String>) {
    deck.shuffle()
}

fun eineKarteZiehen(deck: MutableList<String>): String {
    val karte = deck.first()
    deck.remove(deck.first())
    meinDeck = deck
    return karte
}

fun kartenWert(karte: String): Int {
    val kartenWert = karte.split(" ")[1]

    return when (kartenWert) {
        "2" -> 2
        "3" -> 3
        "4" -> 4
        "5" -> 5
        "6" -> 6
        "7" -> 7
        "8" -> 8
        "9" -> 9
        in listOf("10", "Koenig", "Dame", "Bube") -> 10
        "Ass" -> 11
        else -> 0
    }
}

fun punktzahlHand(karten: MutableList<String>): Int {
    var wertHand: Int = 0
    for (i in karten) {
        wertHand += kartenWert(i)
    }
    return wertHand
}

fun looseTerm(hand: MutableList<String>): Boolean {
    val number: Int = punktzahlHand(hand)
    var condition: Boolean = false
    while (number > 21) {
        condition = true
        break
    }
    return condition
}
