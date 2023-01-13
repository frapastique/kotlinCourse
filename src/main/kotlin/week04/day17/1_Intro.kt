fun main() {

    /*
    Fangen wir mit dem Ist-Gleich-Operator (`==`) an.
    Dieser Operator vergleicht den Wert links vom Ist-Gleich-Operator
    mit dem Wert rechts vom Ist-Gleich-Operator.
    Wenn beide Werte gleich sind, gibt der Operator ein `true` zurück.
    Wenn beide Werte nicht gleich sind, gibt der Operator ein `false` zurück.

    Ein-Beispiel:
    */

    println(5 == 5)
    println(5 == 10)

    /*
    `true` und `false` sind die Werte des Datentyps Boolean.
    Das heißt, Vergleichsoperatoren geben ein Boolean zurück.
    Den Boolean kann man auch wieder in einer Variable speichern.
     */

    var isEqual: Boolean = 5 == 5
    println("Variable isEqual hat den Wert $isEqual.")

    /*
    Und gestern haben wir gelernt, dass eine If-Else-Verzweigung in den If-Teil springt,
    wenn die If-Else-Verzweigung ein true bekommt und in den Else-Teil springt, wenn sie
    ein false bekommt.
    * */

    // If-Teil
    var isTrue = true;
    if (isTrue) {
        println("Jetzt im If-Teil.")
    } else {
        println("Wird nicht ausgeführt.")
    }

    // Else-Teil
    var isFalse = false;
    if (isFalse) {
        println("Wird nicht ausgeführt.")
    } else {
        println("Jetzt im Else-Teil.")
    }

    // Kombiniert mit den Vergleichsoperatoren sind Verzweigungen sehr mächtig.
    if (5 == 5) {
        println("5 ist gleich 5")
    } else {
        println("Wird nicht ausgeführt.")
    }

    if (5 == 10) {
        println("Wird nicht ausgeführt.")
    } else {
        println("5 ist nicht 10!")
    }

    // Weitere Operatoren habt ihr heute in der Vorlesung kennengelernt.
    // Nehmt euch ein paar Minuten und schaut nach, welche Vergleichsoperatoren es sonst noch gibt,
    // bzw. ihr in der Vorlesung heute kennengelernt habt und probiert sie ein wenig aus.

}