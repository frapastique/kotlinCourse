fun main() {
    print("Bitte gib dein Alter ein: ")
    var alterInput = readln()

    try {
        var alter: Int = alterInput.toInt()
        if (alter >= 18) {
            println("Willkommen, hier ist dein Bier, let's party!")
        } else {
            println("Sorry, kein Einlass zur Party. Ist ab 18.")
        }
    } catch (e: Exception) {
        println("Eingabe nicht valide, gebe eine Ganze Zahl an!")
    }
}