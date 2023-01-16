fun main() {
    println("Hier drucken wir jede Erhöhung von i aus:")
    var wirdInSchleifeGedruckt = 1
    while (wirdInSchleifeGedruckt <= 3) {
        println("i ist jetzt " + wirdInSchleifeGedruckt)
        wirdInSchleifeGedruckt++
    }

    println("Hier drucken wir nur das Endergebnis aus:")
    var wirdNachSchleifeGedruckt = 1
    while (wirdNachSchleifeGedruckt < 3) {
        wirdNachSchleifeGedruckt++
    }
    println(wirdNachSchleifeGedruckt)


    /* FRAGEN:
    * 1. Schaut mit dem Debugger nach, welchen Wert die Variable wirdInSchleifeGedruckt am Ende der Schleife hat.
    * Warum wird nicht dieser Wert ausgegeben?
    *       Der Endwert ist vier (4). Dieser wird nicht in der Konsole ausgegeben, weil in der while Schleife <= 3 als
    *       Bedingung festgelegt wurde. Da 4 größer als 3 ist, zählt dieser als Ausstiegswert (while ist false).
    * 2. Inwiefern unterscheiden sich Schleife 1 und Schleife 2?
    *       In der 1. Schleife ist die Bedingung <= 3 (kleiner gleich 3)
    *       In der 2. Schleife ist die Bedingung > 3 (größer 3)
    *       Somit wird in der 2. Schleife erst etwas in der Konsole ausgegeben sobald der Wert größer als 3 ist.
    *       Also sobald bis 4 aufaddiert wurde wird der Endwert ausgegeben!
     */

}