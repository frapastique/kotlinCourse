fun moneyActions(money: Int, action: String) {
    var bet: Int = humanBet
    while (true) {
        if (action == "set") {
            println("\nMöglicher Einsatz liegt zwischen 1€ und $money€\n")
            try {
                bet = checkInput().toInt()
            } catch (e: Exception) {
                println("\nBitte gebe eine Zahl als Integer ein!")
                moneyActions(moneyHuman, "set")
            }
            if (bet > money) {
                println("\nDer Einsatz von $bet€ ist zu hoch. Konto nicht ausreichend gedeckt.")
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
            counterWon += bet
            println("Gewinn:      ${bet * 2}€")
            println("Kontostand:  $moneyHuman€")
            return
        }
        if (action == "loose") {
            counterLost += bet
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

fun setHumanMoney(): Int {
    println("\nWie hoch ist dein Startkapital?")
    var money: Int = 0
    try {
        money = checkInput().toInt()
        if (money == 0) {
            println("\nGebe einen einen Betrag größer 0 ein.")
            setHumanMoney()
        }
    } catch (e: Exception) {
        println("\nBitte gebe eine Zahl als Integer ein!")
        setHumanMoney()
    }
    return money
}