fun moneyActions(money: Int, action: String) {
    var bet: Int = humanBet
    while (bet <= money) {
        if (action == "set") {
            println("\nMöglicher Einsatz liegt zwischen 1€ und $money€\n")
            bet = checkInput().toInt()
            if (bet > money) {
                println("Der Einsatz von $bet€ ist zu hoch. Konto nicht ausreichend gedeckt.")
                moneyActions(moneyHuman, "set")
            }
            moneyHuman = money - bet
            humanBet = bet
            println("\nKontostand:  $moneyHuman€")
            println("Einsatz:     $bet€")
            return
        }
        if (action == "win") {
            moneyHuman += bet * 2
            println("Gewinn:      ${bet * 2}€")
            println("Kontostand:  $moneyHuman€")
            return
        }
        if (action == "loose") {
            println("Verlust:     $bet€")
            println("Kontostand:  $moneyHuman€")
            return
        }
        if (action == "draw") {
            moneyHuman += bet
            println("Gutschrift:  $bet€")
            println("Kontostand:  $moneyHuman€")
            return
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
    }
}