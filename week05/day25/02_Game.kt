import kotlin.system.exitProcess

fun game(money: Int) {
    var input: String = ""
    if (money != 0) {
        while (money > 0) {
            if (counter == 0) {
                counter = 1
                println("Kontostand: $money€")
                moneyActions(moneyHuman, "set")
                showCards(meinDeck, handHuman, handDealer)
                hitOrPut(handHuman)
            }
            if (counter > 0 && moneyHuman != 0) {
                println(
                    """
                
                Neue Runde:   'yes'
                Beenden:      'stop'
                
                """.trimIndent()
                )
                input = checkInput()
                if (input == "yes") {
                    counter++
                    handHuman.clear()
                    handDealer.clear()
                    println("\nRunde $counter")
                    moneyActions(moneyHuman, "set")
                    showCards(meinDeck, handHuman, handDealer)
                    hitOrPut(handHuman)
                    game(moneyHuman)
                }
                break
            }
            break
        }
    }
    if (moneyHuman == 0) {
        println("""
            
            Aufladen:     'yes'
            Beenden:      'stop'
            
            """.trimIndent()
        )
        input = checkInput()
        if (input == "yes") {
            counterRestock++
            moneyHuman = setHumanMoney()
            game(moneyHuman)
        } else if (input == "stop") {
            println("""
                Statistik:
                
                Runden:     $counter
                Verloren:   $counterLoose
                Draw:       $counterDraw
                Gewonnen:   $counterWin
                
                Hits:       $counterHit
                Stands:     $counterStand
                
                Kontostand: $moneyHuman€
                Verdient:   $counterWon€
                Verloren:   $counterLost€
                
                Aufstocken: $counterRestock
                
                Danke fürs Spielen und bis zum nächsten Mal!""".trimIndent())
            exitProcess(0)
        }
    }
}