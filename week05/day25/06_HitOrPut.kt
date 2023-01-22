fun hitOrPut(hand0: MutableList<String>) {
    println("""
        
        Karte ziehen: 'hit'
        Nicht ziehen: 'stand'
        Dealers Hand: 'dealer'
        Beide Hände:  'beide'
        Kontostand:   'konto'
        
        """.trimIndent())

    val input: String = checkInput()
    val karte: String = eineKarteZiehen(meinDeck)
    var wert: Int = punktzahlHand(hand0)
    var check: Boolean

    if (input == "dealer") {
        cardsDealer()
    }

    if (input == "beide") {
        cardsHuman()
        cardsDealer()
    }

    if (input == "konto") {
        moneyActions(moneyHuman, "money")
    }

    if (input == "stand") {
        counterStand++
        return dealersTurn(handDealer, wert)
    }

    while (input == "hit") {
        counterHit++
        hand0.add(karte)
        check = looseTerm(hand0)
        handHuman = hand0
        wert = punktzahlHand(hand0)

        println("\nDeine Karten: ${hand0.joinToString("' '", "'", "'")}")
        println("Wert: $wert")

        if (wert == 21) {
            counterWin++
            println("\nGratuliere du hast gewonnen.")
            moneyActions(moneyHuman, "win")
            return
        }

        if (check) {
            counterLoose++
            println("\nDu hast mit dem Wert '$wert' verloren!")
            moneyActions(moneyHuman, "loose")
            return
        } else {
            return hitOrPut(handHuman)
        }
    }
}
