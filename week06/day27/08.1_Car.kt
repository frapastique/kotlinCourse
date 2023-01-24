class Auto(var ps: Int, var color: String, var seats: Int, var freeSeats: Int) {

    init {
        require(ps >= 1) {"PS kann nicht kleiner als 1 sein!"}
        require(seats >= 1) {"Es muss mindestens 1 Sitzplatz zur bereitgestellt werden!"}
        if (freeSeats > seats) {
            throw IllegalArgumentException("Es können nicht mehr freie Sitzplätze als $seats Sitze bereitgestellt werden.")
        }
        if (freeSeats < 1) {
            throw IllegalArgumentException("Es muss mindestens ein Sitzplatz bereitgestellt werden.")
        }
    }

    fun getIn() {
        if (freeSeats > 0) {
            freeSeats--
            if (freeSeats == 0) {
                println("Das Auto ist nun mit $seats Peronen voll besetzt.")
            } else {
                println("Das Auto hat noch $freeSeats von $seats Sitzplätzen frei.")
            }
        } else {
            println("Das Auto ist mit $seats Personen voll besetzt und hat keine freien Plätze mehr.")
        }
    }

    fun getOut() {
        if (freeSeats < seats) {
            freeSeats++
            if (freeSeats == seats) {
                println("Das Auto ist leer.")
            } else {
                println("Das Auto hat nun $freeSeats von $seats freie Sitzplätze.")
            }
        } else {
            println("Im Auto sitzt niemand und hat $freeSeats freie Sitzplätze.")
        }
    }

    fun startEngine() {
        if (seats > freeSeats) {
            println("wroom wroom")
        } else {
            println("Das Auto ist leer und wird somit nicht gestartet.")
        }
    }
}