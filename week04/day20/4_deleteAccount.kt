fun deleteAccount() {
    print("\nGebe den Namen an, dessen Account entfernt werden soll: ")
    val name: String = readln()
    if (name in registryBankAccounts) {
        registryBankAccounts.remove(name)
        println("Das Konto von $name wurde erfolgreich entfernt!")
        println(registryBankAccounts)
    } else {
        println("Es besteht kein Konto mit diesem Namen!")
        deleteAccount()
    }
}