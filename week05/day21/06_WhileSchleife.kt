fun main() {
    // Festlegen der Variablen i als Integer mit dem Wert 100
    var i: Int = 100
    // while Schleife mit der Bedingung: solange i größer als 0 ist. Sobald die Schleife 0 erreicht ist die Bedingung false und die Schleife wird unterbrochen.
    while (i > 0) {
        // Solange der Wert über 0 ist, wird die entsprechende Zahl ausgegeben, beginnend mit 100
        println(i)
        // Von i wird pro Schleifen-Durchlauf 1 zähler abgezogen
        i--
    }
}