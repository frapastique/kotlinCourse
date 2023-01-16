fun getNameFrom(): String {
    println("Gebe deinen Namen an: ")
    val name: String = readln()
    if (name in registryBankAccounts) {
        return name
    } else {
        println("Du hast kein Konto bei uns oder du hast deinen Namen falsch eingegeben.\n")
        return getNameFrom()
    }
}

fun getNameTo(): String {
    println("Gebe den Empfänger Name an: ")
    val name: String = readln()
    if (name in registryBankAccounts) {
        return name
    } else {
        println("Diese Person hat bei uns kein Konto oder du hast den Namen falsch eingegeben.\n")
        return getNameTo()
    }
}

fun getTransferValue(): Double {
    println("Gebe den zu Überweisenden Betrag an: ")
    try {
        val transferMoney: Double = readln().toDouble()
        return transferMoney
    } catch (e: Exception) {
        println("Eingabe ungültig! Gebe Zahlen ein!\n")
        return getTransferValue()
    }
}

fun checkBalanceOkay(nameFrom: String, money: Double): Double {
    val balance: Double = registryBankAccounts.getValue(nameFrom)
    if (money <= balance) {
        return money
    } else {
        println("""
            
            Zu Überweisender Betrag zu hoch!
            Aktueller Kontostand: $balance€
            
            """.trimIndent())
        return getTransferValue()
    }
}

fun internalTransfer() {
    println("Bankinterne Überweisung:\n")

    val nameFrom: String = getNameFrom()
    val balanceFrom: Double = registryBankAccounts.getValue(nameFrom)

    val nameTo: String = getNameTo()
    val balanceTo: Double = registryBankAccounts.getValue(nameTo)

    val money: Double = checkBalanceOkay(nameFrom, getTransferValue())

    val newBalanceFrom: Double = balanceFrom - money
    registryBankAccounts.set(nameFrom, newBalanceFrom)
    println("""
            Konto Inhaber:    $nameFrom
            Alter Kontostand: $balanceFrom
            Neuer Kontostand: $newBalanceFrom
            
            """.trimIndent())

    val newBalanceTo: Double = balanceTo + money
    registryBankAccounts.set(nameTo, newBalanceTo)
    println("""
            Konto Inhaber:    $nameTo
            Alter Kontostand: $balanceTo
            Neuer Kontostand: $newBalanceTo
            
            """.trimIndent())
}
