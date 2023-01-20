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
    showCards(meinDeck, handHuman, handDealer)
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
        wertHand = kartenWert(i)
    }
    return wertHand
}

fun showCards(deck: MutableList<String>, hand0: MutableList<String>, hand1: MutableList<String>) {
    mischen(deck)

    while (hand0.size < 2) {
        hand0.add(eineKarteZiehen(deck))
    }
    if (hand0.size == 2) {
        println("Deine Karten sind: '${hand0[0]}' '${hand0[1]}'")
        println("Wert: = ${punktzahlHand(hand0)}")
        handHuman = hand0
    }

    while (hand1.size < 2) {
        hand1.add(eineKarteZiehen(deck))
    }
    if (hand1.size == 2) {
        var karte0: Int = kartenWert(hand1[0])
        var karte1: Int = kartenWert(hand1[1])
        if (karte0 > karte1) {
            println("Karten Dealer:     '${hand1[0]}' 'Verdeckt' = $karte0")
            println("Wert: = $karte0")
        } else {
            println("Karten Dealer:     '${hand1[1]}' 'Verdeckt'")
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
    while (true) {
        var input = readln().lowercase()
        if (input.isNotBlank()) {
            when (input) {
                "hit" -> {
                    return input
                }
                "put" -> {
                    return input
                }
                else -> {
                    println("Deine Eingabe '$input' ist nicht möglich. Versuche es erneut! ")
                    checkInput()
                }
            }
        } else {
            println("Deine Eingabe '$input' ist nicht möglich. Versuche es erneut! ")
            checkInput()
        }
    }
}

