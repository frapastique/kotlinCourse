class Mitarbeiter(id: Int, name: String, position: String, gehalt: Double, artDerBeschaeftigung: String, mutterschaftsUrlaub: Boolean) {

    var id: Int = 0
    var name: String = ""
    var position: String = ""
    var gehalt: Double = 0.00
    var artDerBeschaeftigung: String = ""
    var mutterschaftsUrlaub: Boolean = true

    fun gehaltAusgeben() {
        println("Name:   $name")
        println("Gehalt: $gehalt")
    }

    fun befoerdern(neuePosition: String, neuerGehalt: Double) {
        position = neuePosition
        gehalt = neuerGehalt
    }

    fun istVerfuegbar() {
        if (true) {
            println("Mitarbeiter:in ist gerade im Mutterschaftsurlaub.")
        } else {
            println("Mitarbeiter:in ist Verfügbar.")
        }
    }
}