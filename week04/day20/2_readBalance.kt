fun readBalance(): Double {
    var bankAccounts: MutableList<String> = registryBankAccounts.keys.toMutableList()
    print("\nGebe einen Namen an, dessen Kontostand abgefragt werden soll: ")
    val name: String = readln()
    try {
        name in bankAccounts
        println("Kontostand $name:")
        return registryBankAccounts.getValue(name)
    } catch (e: Exception) {
        println("Zu diesem Namen gibt es kein Bankkonto!")
        return readBalance()
    }
}