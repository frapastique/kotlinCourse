class Mitarbeiter(id: Int, name: String, position: String, gehalt: Double, artDerBeschaeftigung: String, mutterschaftsUrlaub: Boolean) {

    var id: Int = id
    var name: String = name
    var position: String = position
    var gehalt: Double = gehalt
    var artDerBeschaeftigung: String = artDerBeschaeftigung
    var mutterschaftsUrlaub: Boolean = mutterschaftsUrlaub

    fun gehaltAusgeben() {
        println("Name:   $name")
        println("Gehalt: $gehalt")
        println()
    }

    fun befoerdern() {
        println("Mitarbeiter:   $name")
        println("Position:      $position")
        println("Gehalt:        $gehalt")
        println()
    }

    fun istVerfuegbar() {
        if (mutterschaftsUrlaub) {
            println("$name ist gerade im Mutterschaftsurlaub.")
        } else {
            println("$name ist Verfügbar.")
        }
    }
}