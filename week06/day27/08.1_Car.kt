class Auto(var name: String,var ps: Int, var color: String, var seats: Int, var freeSeats: Int) {

    init {
        require(ps >= 1) {"PS kann nicht kleiner als 1 sein!"}
        require(seats >= 1) {"Es muss mindestens 1 Sitzplatz bereitgestellt werden!"}
        if (freeSeats > seats) {
            throw IllegalArgumentException("Es können nicht mehr freie Sitzplätze als $seats Sitze bereitgestellt werden.")
        }
        if (freeSeats < 1) {
            throw IllegalArgumentException("Es muss mindestens ein Sitzplatz bereitgestellt werden.")
        }
    }

    fun getIn(persons: Int) {
        if (freeSeats > 0) {
            freeSeats -= persons
            if (freeSeats == 0) {
                println("Der $name ist nun mit $seats Peronen voll besetzt.")
            } else {
                println("Der $name hat noch $freeSeats von $seats Sitzplätzen frei.")
            }
        } else {
            println("Der $name ist mit $seats Personen voll besetzt und hat keine freien Plätze mehr.")
        }
    }

    fun getOut(persons: Int) {
        if (freeSeats < seats) {
            freeSeats += persons
            if (freeSeats == seats) {
                println("Der $name ist leer.")
            } else {
                println("Der $name hat nun $freeSeats von $seats freie Sitzplätze.")
            }
        } else {
            println("Im Auto $name sitzt niemand und hat $freeSeats freie Sitzplätze.")
        }
    }

    fun startEngine() {
        if (seats > freeSeats) {
            println("Motor von $name startet.")
        } else {
            println("Der $name ist leer und wird somit nicht gestartet.")
        }
    }

    fun show() {
        println("""
            Name:   $name
            PS:     $ps
            Sitze:  $seats
            
            """.trimIndent())
    }
}