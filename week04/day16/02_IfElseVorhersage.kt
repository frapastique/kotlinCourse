package week.`4`.day.`16`.Tag16_Projekt.Aufgabe2.src
/*
    Schreibe hier deine Lösung für die Aufgabe hin:

    Leider scheint heute nicht die Sonne und es ist bewölkt.

 */

fun main() {
    val sunny = false;
    val cloudy = true

    if (sunny) {
        println("Heute scheint die Sonne!")
    } else {
        if (cloudy) {
            println("Leider scheint heute nicht die Sonne und es ist bewölkt.")
        } else {
            println("Es scheint zwar nicht die Sonne aber es ist auch nicht zu wolkig.")
        }
    }
}