// a) Schreibe eine Funktion mit passendem Rückgabewert, die 5 zurückgibt.

fun taskA(): Int {
    return 5
}

// b) Schreibe eine Funktion mit passendem Rückgabewert, die 6.234 zurückgibt.

fun taskB(): Double {
    return 6.234
}

// c) Schreibe eine Funktion mit passendem Rückgabewert, die "Hallo" zurückgibt.

fun taskC(): String {
    return "Hallo"
}

// d) Schreibe eine Funktion, die eine Liste vom Typ String zurückgibt.
//    Die Liste ist dabei initial (also zu Begin) mit folgenden Werten gefüllt:
//    "Hallo", "Welt", "!"

fun taskD(): List<String> {
    val listOfHalloWelt: List<String> = listOf("Hallo", "Welt", "!",)
    return listOfHalloWelt
}

// e) Schreibe eine Funktion, die eine MutableMap zurückgibt. Der Key der MutableMap ist vom Typ String,
//    der Wert der MutableMap ist vom Typ Boolean.
//    Die MutableMap ist dabei initial (also zu Begin) mit folgenden Paaren gefüllt:
//    "Lernen wir die Sprache Französisch?" to false
//    "Lernen wir die Sprache Kotlin?" to true

fun taskE(): MutableMap<String, Boolean> {
    var mutableMapOfLanguage: MutableMap<String, Boolean> = mutableMapOf(
        "Lernen wir die Sprache Französisch?" to false,
        "Lernen wir die Sprache Kotlin?" to true,
    )
    return mutableMapOfLanguage
}

// f) Schreibe eine Funktion, die nichts zurückgibt.

fun taskF() {
    return
}

fun main() {
    println(taskA())
    println(taskB())
    println(taskC())
    println(taskD())
    println(taskE())
    println(taskF())
}