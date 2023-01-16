fun giveMoney() {
    println("\nWillkommen am Geldautomat.\nEinzahlungsmodus:\n")
    print("Gebe einen Namen für das Konto an: ")
    val name: String = readln()
    println("Hallo $name!")
    print("\nGebe den Betrag an welcher eingezahlt werden soll: ")
    val money: Double = readln().toDouble()
    if (name in registryBankAccounts) {
        val balance: Double = registryBankAccounts.getValue(name)
        val newBalance: Double = balance + money
        println("Alter Kontostand: $balance€")
        println("Neuer Kontostand: $newBalance")
        registryBankAccounts.set(name, newBalance)
    } else {
        registryBankAccounts.put(name, money)
        println("Es wurde für $name ein neues Konto angelegt!\n Kontostand: $money€")
    }
}