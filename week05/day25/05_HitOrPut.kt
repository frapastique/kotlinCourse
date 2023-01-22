import kotlin.system.exitProcess

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
        humanBet(moneyHuman, "0", "money")
    }

    if (input == "stand") {
        return dealersTurn(handDealer, wert)
    }

    while (input == "hit") {
        hand0.add(karte)
        check = looseTerm(hand0)
        handHuman = hand0
        wert = punktzahlHand(hand0)

        println("\nDeine Karten: ${hand0.joinToString("' '", "'", "'")}")
        println("Wert: $wert")

        if (wert == 21) {
            println("\nGratuliere du hast gewonnen.")
            break
        }

        if (check) {
            println("\nDu hast mit dem Wert '$wert' verloren!")
            exitProcess(0)
        } else {
            return hitOrPut(handHuman)
        }
    }
}
