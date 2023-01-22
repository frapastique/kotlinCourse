fun moneyStatus(money: Int) {
    println("Kontostand: $money€")
    hitOrPut(handHuman)
}

fun humanBet(money: Int, bet: String, action: String) {
    while (bet.toInt() <= money) {
        if (action == "win") {
            moneyHuman += bet.toInt() * 2
            println("Gutschrift:  ${bet.toInt() * 2}")
            println("Kontostand:  $moneyHuman€")
            break
        }
        if (action == "loose") {
            moneyHuman = money - bet.toInt()
            println("Lastschrift: $bet€")
            println("Kontostand:  $moneyHuman€")
            break
        }
        if (action == "initial") {
            moneyHuman = money - bet.toInt()
            println("Kontostand:  $moneyHuman€")
            println("Einsatz:     $bet€")
            break
        }
        if (action == "draw") {
            moneyHuman += bet.toInt()
            println("Gutschrift:  $bet€")
            println("Kontostand:  $moneyHuman€")
            break
        }
        if (action == "money") {
            println("Kontostand:  $moneyHuman€")
            hitOrPut(handHuman)
        }
        if (action == "bet") {
            println("Einsatz:     $bet€")
            hitOrPut(handHuman)
        }
        if (action == "both") {
            println("Kontostand:  $moneyHuman€")
            println("Einsatz:     $bet€")
            hitOrPut(handHuman)
        }
        println("Der Einsatz von $bet€ zu hoch. Konto nicht ausreichend gedeckt.")
        break
    }
}