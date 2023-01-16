fun addAccount() {
    var bankAccounts: MutableList<String> = registryBankAccounts.keys.toMutableList()
    print("\nGebe den Namen des neuen Kontoinhabers ein: ")
    val name: String = readln()
    if (name !in bankAccounts) {
        print("\nGebe die höhe des Kontostands an: ")
        val number: Double = readln().toDouble()
        registryBankAccounts.put(name, number)
        println(registryBankAccounts)
    } else {
        println("Dieser Kunde hat bereits ein Konto!")
        addAccount()
    }
}