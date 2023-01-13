fun main() {
    checkMotorDoors(true, false)
}

// Die Funktionen start() und closeDoors() sind vorgegeben.
fun start() {
    println("Software gestartet.")
}

fun closeDoors() {
    println("Bitte alle Türen schließen.")
}

fun checkMotorDoors(isMotorRunning: Boolean, doorsAreClosed: Boolean) {
    // check if doors are closed, if true: continue to check if motor is running
    if (doorsAreClosed) {
        // if doors are closed and motor is running execute function start
        if (isMotorRunning)
            start()
    } else {
        // if doors aren't closed, execute function closeDoors
        closeDoors()
    }
}