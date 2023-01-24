class Auto {
    var ps: Int
    var color: String
    var seats: Int
    var freeSeats: Int

    constructor(ps: Int, color: String, seats: Int, freeseats: Int) {
        this.ps = ps
        this.color = color
        this.seats = seats
        this.freeSeats = freeseats
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