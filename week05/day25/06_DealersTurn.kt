fun dealersTurn(hand1: MutableList<String>, handWert: Int) {
    println("\nDealer ist an der Reihe:")

    val karte: String = eineKarteZiehen(meinDeck)
    var wert: Int = punktzahlHand(hand1)
    var check: Boolean = looseTerm(hand1)

    println("\nKarten Dealer:  ${hand1.joinToString("' '", "'", "'")}")
    println("Wert: $wert")
    cardsHuman()

    while (true) {
        if (check) {
            counterWin++
            println("\nDer Dealer verliert mit dem Wert: $wert")
            moneyActions(moneyHuman, "win")
            break
        }
        if (wert == handWert) {
            if (wert > 17) {
                counterDraw++
                println("Ein Unentschieden!")
                moneyActions(moneyHuman, "draw")
                break
            } else {
                continue
            }
        }
        if (wert == 21 || (wert >= 17 && wert > handWert && wert < 21)) {
            counterLoose++
            println("\nDer Dealer gewinnt mit dem Wert: $wert")
            moneyActions(moneyHuman, "loose")
            break
        }
        if (wert < 17 || wert < handWert) {
            hand1.add(karte)
            check = looseTerm(hand1)
            handDealer = hand1
            wert = punktzahlHand(hand1)

            println("\nKarten Dealer:  ${hand1.joinToString("' '", "'", "'")}")
            println("Wert: $wert")
            cardsHuman()
            continue
        }
    }
    return
}