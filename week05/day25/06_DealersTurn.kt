import kotlin.system.exitProcess

fun dealersTurn(hand1: MutableList<String>, handWert: Int) {
    println("\nDealer ist an der Reihe:")

    val karte: String = eineKarteZiehen(meinDeck)
    var wert: Int = punktzahlHand(hand1)
    var check: Boolean

    if (wert == 21) {
        println("\nKarten Dealer:  ${hand1.joinToString("' '", "'", "'")}")
        println("Wert: $wert")
        println("\nDer Dealer gewinnt mit dem Wert '$wert'!")
        exitProcess(0)
    }

    while (wert < 17) {
        println("\nKarten Dealer:  ${hand1.joinToString("' '", "'", "'")}")
        println("Wert: $wert")

        hand1.add(karte)
        check = looseTerm(hand1)
        handDealer = hand1
        wert = punktzahlHand(hand1)

        println("\nKarten Dealer:  ${hand1.joinToString("' '", "'", "'")}")
        println("Wert: $wert")

        if (check) {
            println("\nDer Dealer verliert mit dem Wert '$wert'!")
            exitProcess(0)
        }
    }

    if (wert >= handWert) {
        println("\nKarten Dealer:  ${hand1.joinToString("' '", "'", "'")}")
        println("Wert: $wert")
        cardsHuman()

        println("\nDer Dealer gewinnt mit dem Wert '$wert'!")
        exitProcess(0)
    }

    while (wert <= handWert) {
        println("\nKarten Dealer:  ${hand1.joinToString("' '", "'", "'")}")
        println("Wert: $wert")
        hand1.add(karte)
        check = looseTerm(hand1)
        handDealer = hand1
        wert = punktzahlHand(hand1)

        println("\nKarten Dealer:  ${hand1.joinToString("' '", "'", "'")}")
        println("Wert: $wert")
        cardsHuman()

        if (wert in (handWert + 1)..21) {
            println("\nDer Dealer gewinnt mit dem Wert '$wert'!")
            exitProcess(0)
        }
        if (check) {
            println("\nDer Dealer verliert mit dem Wert '$wert'!")
            exitProcess(0)
        }
    }
}
