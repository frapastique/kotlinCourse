fun showCards(deck: MutableList<String>, hand0: MutableList<String>, hand1: MutableList<String>) {
    mischen(deck)

    while (hand0.size < 2) {
        hand0.add(eineKarteZiehen(deck))
    }
    if (hand0.size == 2) {
        val wert = punktzahlHand(hand0)
        println("\nDeine Karten sind: '${hand0[0]}' '${hand0[1]}'")
        println("Wert: = $wert")
        handHuman = hand0
        if (wert == 21) {
            counterWin++
            println("\nGratuliere du hast bereits gewonnen.")
            moneyActions(moneyHuman, "win")
            return game(moneyHuman)
        }
        val check: Boolean = looseTerm(hand0)
        if (check) {
            counterLoose++
            println("Schade... bereits verloren!")
            moneyActions(moneyHuman, "loose")
            return game(moneyHuman)
        }
    }

    while (hand1.size < 2) {
        hand1.add(eineKarteZiehen(deck))
    }
    if (hand1.size == 2) {

        val karte0: Int = kartenWert(hand1[0])
        val karte1: Int = kartenWert(hand1[1])
        if (karte0 > karte1) {
            println("\nKarten Dealer:     '${hand1[0]}' 'Verdeckt'")
            println("Wert: = $karte0")
        } else {
            println("\nKarten Dealer:     '${hand1[1]}' 'Verdeckt'")
            println("Wert: = $karte1")
        }
        handDealer = hand1
    }
}

fun cardsDealer() {
    val karte0: Int = kartenWert(handDealer[0])
    val karte1: Int = kartenWert(handDealer[1])

    if (karte0 > karte1) {
        println("\nKarten Dealer:  '${handDealer[0]}' 'Verdeckt' = $karte0")
        println("Wert: = $karte0")
        hitOrPut(handHuman)
    } else {
        println("\nKarten Dealer:  '${handDealer[1]}' 'Verdeckt'")
        println("Wert: = $karte1")
        hitOrPut(handHuman)
    }
}

fun cardsHuman() {
    println("\nDeine Karten:   ${handHuman.joinToString("' '", "'", "'")}")
    println("Wert: ${punktzahlHand(handHuman)}")
}
