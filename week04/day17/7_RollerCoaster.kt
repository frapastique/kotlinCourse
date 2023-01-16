fun main() {
    if (
        canIRide(180, 20, false) &&
        canIRide(150, 20, false) &&
        canIRide(180, 15, false) &&
        !canIRide(150, 15, false) &&
        !canIRide(150, 15, true) &&
        !canIRide(180, 20, true)
    ) {
        println("Perfekt!")
    } else {
        println("Fehler.")
    }

    // Teste hier dich selbst.
    println(canIRide(180, 20, false))
}

fun canIRide(size: Int, age: Int, isRaining: Boolean): Boolean {
    // Schreib hier deinen Code hin.
    return (size >= 170 || age >= 18) && !isRaining
}