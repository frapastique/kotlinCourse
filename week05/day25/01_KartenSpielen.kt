import kotlin.system.exitProcess

val kartendeck: List<String> = listOf(
    "Pik Ass", "Pik Koenig", "Pik Dame", "Pik Bube", "Pik 10", "Pik 9",
    "Pik 8", "Pik 7", "Pik 6", "Pik 5", "Pik 4", "Pik 3", "Pik 2",
    "Kreuz Ass", "Kreuz Koenig", "Kreuz Dame", "Kreuz Bube", "Kreuz 10", "Kreuz 9",
    "Kreuz 8", "Kreuz 7", "Kreuz 6", "Kreuz 5", "Kreuz 4", "Kreuz 3", "Kreuz 2",
    "Herz Ass", "Herz Koenig", "Herz Dame", "Herz Bube", "Herz 10", "Herz 9",
    "Herz 8", "Herz 7", "Herz 6", "Herz 5", "Herz 4", "Herz 3", "Herz 2",
    "Karo Ass", "Karo Koenig", "Karo Dame", "Karo Bube", "Karo 10", "Karo 9",
    "Karo 8", "Karo 7", "Karo 6", "Karo 5", "Karo 4", "Karo 3", "Karo 2",
)

var handHuman: MutableList<String> = mutableListOf()
var handDealer: MutableList<String> = mutableListOf()
var meinDeck = kartendeck.toMutableList()

fun main() {
    println("Game: Blackjack")
    showCards(meinDeck, handHuman, handDealer)
    hitOrPut(handHuman)
}

fun mischen(deck: MutableList<String>) {
    deck.shuffle()
}

fun eineKarteZiehen(deck: MutableList<String>): String {
    var karte = deck.first()
    deck.remove(deck.first())
    meinDeck = deck
    return karte
}

fun kartenWert(karte: String): Int {
    var kartenWert = karte.split(" ")[1]

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

fun showCards(deck: MutableList<String>, hand0: MutableList<String>, hand1: MutableList<String>) {


    mischen(deck)

    while (hand0.size < 2) {
        hand0.add(eineKarteZiehen(deck))
    }
    if (hand0.size == 2) {
        println("\nDeine Karten sind: '${hand0[0]}' '${hand0[1]}'")
        println("Wert: = ${punktzahlHand(hand0)}")
        handHuman = hand0
        var check: Boolean = looseTerm(hand0)
        if (check) {

            println("Schade... bereits verloren!")
            exitProcess(0)
        }
    }

    while (hand1.size < 2) {
        hand1.add(eineKarteZiehen(deck))
    }
    if (hand1.size == 2) {

        var karte0: Int = kartenWert(hand1[0])
        var karte1: Int = kartenWert(hand1[1])
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

fun looseTerm(hand: MutableList<String>): Boolean {
    val number: Int = punktzahlHand(hand)
    var condition: Boolean = false
    while (number > 21) {
        condition = true
        break
    }
    return condition
}

fun checkInput(): String {
    print("Deine Entscheidung: ")
    var input: String = readln().lowercase()
    while (true) {
        if (input.isNotEmpty()) {
            when (input) {
                "hit" -> {

                    return input
                }
                "stand" -> {

                    return input
                }
                "dealer" -> {
                    return input
                }
                "beide" -> {
                    return input
                }
                else -> {
                    println("Deine Eingabe '$input' ist nicht möglich. Versuche es erneut!")
                    return checkInput()
                }
            }
        } else {
            println("Deine Eingabe '$input' ist nicht möglich. Versuche es erneut!")
            return checkInput()
        }
    }
}

fun cardsDealer() {
    var karte0: Int = kartenWert(handDealer[0])
    var karte1: Int = kartenWert(handDealer[1])

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
    println("\nDeine Karten: ${handHuman.joinToString("' '", "'", "'")}")
    println("Wert: ${punktzahlHand(handHuman)}")
}

fun hitOrPut(hand0: MutableList<String>) {
    println("""
        
        Karte ziehen: 'hit'
        Nicht ziehen: 'stand'
        Dealers Hand: 'dealer'
        Beide Hände:  'beide' 
        
        """.trimIndent())

    var input: String = checkInput()
    var karte: String = eineKarteZiehen(meinDeck)
    var wert: Int = punktzahlHand(hand0)
    var check: Boolean

    if (input == "dealer") {
        cardsDealer()
    }

    if (input == "beide") {
        cardsHuman()
        cardsDealer()
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

fun dealersTurn(hand1: MutableList<String>, handWert: Int) {
    println("\nDealer ist an der Reihe:")

    var karte: String = eineKarteZiehen(meinDeck)
    var wert: Int = punktzahlHand(hand1)
    var check: Boolean
    var showCards: String = "\nKarten Dealer:  ${hand1.joinToString("' '", "'", "'")}"

    if (wert == 21) {
        println("\nDer Dealer gewinnt mit dem Wert '$wert'!")
        exitProcess(0)
    }

    while (wert < 17) {
        hand1.add(karte)
        check = looseTerm(hand1)
        handDealer = hand1
        wert = punktzahlHand(hand1)

        println(showCards)
        println("Wert: $wert")

        if (check) {
            println("\nDer Dealer verliert mit dem Wert '$wert'!")
            exitProcess(0)
        }
    }

    while (wert <= handWert) {
        hand1.add(karte)
        check = looseTerm(hand1)
        handDealer = hand1
        wert = punktzahlHand(hand1)

        println(showCards)
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

    if (wert > handWert) {
        println(showCards)
        println("Wert: $wert")
        cardsHuman()

        println("\nDer Dealer gewinnt mit dem Wert '$wert'!")
        exitProcess(0)
    }
}