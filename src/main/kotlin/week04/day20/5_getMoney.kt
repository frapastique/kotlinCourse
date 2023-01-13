fun getMoney() {
    println("""
        Willkommen am Geldautomat!
        
        Pro Transaktion kann maximal 500€ abgehoben werden!
        
    """.trimIndent())
    print("\nGeben Sie den Namen des Kontos an, von dem das Geld abgehoben werden soll: ")
    val name: String = readln()
    if (name in registryBankAccounts) {
        val balance: Double = registryBankAccounts.getValue(name)
        print("\nGeben Sie den Betrag an, den sie abbuchen möchte: ")
        val money: Double = readln().toDouble()
        if (money <= balance && money <= 500) {
            val newBalance: Double = balance - money
            println("Geld wurde erfolgreich abgehoben!")
            println("\nAlter Kontostand: $balance€")
            println("\nNeuer Kontostand: $newBalance€")
            registryBankAccounts.set(name, newBalance)
        } else if (money > balance && money <= 500) {
            println("""
                Konto unzureichend gedeckt!
                
                Vorgang wird abgebrochen!""".trimIndent())
            getMoney()
        } else if (money <= balance && money > 500) {
            println("""
                Auszahlung von $money nicht möglich!
                Wert überschreitet Auszahlungswert von 500€.
                
                Vorgang wird abgebrochen!""".trimIndent())
            getMoney()
        } else {
            println("""
                Gebe eine Valide Zahl ein!
                
                Vorgang wird abgebrochen!""".trimIndent())
            getMoney()
        }
    } else {
        println("Dieser Kunde hat bei uns kein Konto!")
        getMoney()
    }
}