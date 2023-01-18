import kotlin.random.Random
val computerGuess = Random.nextInt(1, 100)
var counter: Int = 0

fun main() {
//    println(computerGuess)
    println("""
        Willkommen zum Zahlen Raten Spiel!
        
        Der Computer hat eine Zahl zwischen 1 und 100 gewählt!
        Deine Aufgabe ist es diese zu erraten!
        
    """.trimIndent())
    println(checkNumber())
}

fun checkNumber(): String {
    var humanGuess: Int = checkInt()

    while (true) {
        if (humanGuess == computerGuess && counter == 0) {
            return "\nWoah... Du hast die Zahl $computerGuess erraten im ersten Versuch erraten!"
        } else if (humanGuess in computerGuess - 11 until computerGuess) {
            counter++
            println("Zu klein, aber ganz nah dran!\n")
            return checkNumber()
        } else if (humanGuess in computerGuess + 1 .. computerGuess + 11) {
            counter++
            println("Zu groß, aber ganz nah dran!\n")
            return checkNumber()
        } else if (humanGuess < computerGuess) {
            println("Zu klein!\n")
            counter++
            return checkNumber()
        } else if (humanGuess > computerGuess) {
            println("Zu groß!\n")
            counter++
            return checkNumber()
        } else {
            counter++
            return "\nGratuliere du hast die Zahl $computerGuess in $counter Versuchen erraten!"
        }
    }
}

fun checkInt(): Int {
    while (true) {
        print("Gebe deine Zahl ein: ")
        var guess = readln()
        if (guess?.toIntOrNull() != null) {
            val number = guess.toInt()
            if (number in 1 .. 100) {
                return number
            } else {
                println("Bitte gebe eine Zahl zwischen 1 und 100 ein!\n")
            }
        } else {
            println("Bitte gebe eine Valide Zahl ein!\n")
        }
    }
}