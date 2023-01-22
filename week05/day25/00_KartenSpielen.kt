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
var moneyHuman: Int = 100
var humanBet: Int = 0
var counter: Int = 0
var counterWin: Int = 0
var counterDraw: Int = 0
var counterLoose: Int = 0
var counterWon: Int = 0
var counterLost: Int = 0
var counterHit: Int = 0
var counterStand: Int = 0

fun main() {
    println("Game: Blackjack\n")
    game(moneyHuman)
}

