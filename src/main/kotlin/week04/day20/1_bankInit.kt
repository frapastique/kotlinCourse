var registryBankAccounts: MutableMap<String, Double> = mutableMapOf(
    "Wei-Ling Chen" to 500.35,
    "Maria Gomez" to 800.27,
    "Kofi Boateng" to 12700.74,
    "Akiko Nakamura" to 6100.13,
    "Johann Bauer" to 9800.86,
    "Sigrid Johansson" to 14600.65,
    "Amir Hassan" to 10900.97,
    "Marta Liepa" to 910673.87,
    "Olga Petrovich" to 1300784.78,
    "Bartosz Kowalski" to 16524500.56,
    "Visvaldis Bumbulis" to 6475407.41,
)

fun main() {
    println(registryBankAccounts)

    println(readBalance())
    addAccount()
    deleteAccount()
    getMoney()
    giveMoney()
    internalTransfer()

    println(registryBankAccounts)
}