fun druckeZutaten(zutaten: List<String>){
    println("Zuerst listen wir die Grundzutaten auf...")
    var a = 1
    for (i in zutaten.indices){
        println("$a. Grundzutat: ${zutaten[i]}")
        a++
    }
}

// funktion pizzaTeigKneten
fun pizzaTeigKneten(zutaten: List<String>) {
    println("Grundzutaten werden vermischt....")

    for (i in zutaten.indices){
        if (i in 0..2){
            print("${zutaten[i]}, ")
        }
    }
    println("werden in einer Schüssel vermischt und geknetet....")

    println("...")
    println("Pizzateig erstellt.")
}

// funktion grundPizzaFertigStellen
fun grundPizzaFertigStellen(zutaten: List<String>) {
    for (i in zutaten.indices){
        if (i in 3..zutaten.size){
            print("${zutaten[i]}, ")
        }
    }
    println(" werden auf dem Teig verteilt...")
    println("Die Grundpizza ist fertig.")
}

// funktion belaege
fun belaege() {
    println("Gib jetzt einen Belag ein, den du auf der Pizza sehen willst.")
    var ersterBelag = readln()
    println("Gib bitte einen weiteren Belag ein, den du auf der Pizza sehen willst.")
    var zweiterBelag = readln()
    println("Gib den letzten Belag ein, den du auf der Pizza sehen willst.")
    var dritterBelag = readln()

    var belagListe: List<String> = listOf(ersterBelag,zweiterBelag,dritterBelag)

    println("Alles klar!")
    println("Du hast folgende Beläge ausgewählt:")
    var b = 1
    for (i in belagListe.indices){
        println("$b. Belag: ${belagListe[i]}")
        b++
    }

    println("$ersterBelag, $zweiterBelag und $dritterBelag werden auf die Pizza gelegt...")
}

// funktion ofenCountdown
fun ofenCountdown() {
    println("Jetzt muss die Pizza für 10 Minuten in den Ofen. Der Countdown läuft!")

    for (i in 10 downTo 1){
        if (i > 1){
            println("$i Minuten noch...")
        } else {
            println("$i Minute noch...")
        }
        Thread.sleep(1000)
    }
    println("FERTIG! Genieß die Pizza :P")
}

fun main(){
    var zutatenListe: List<String> = listOf("Mehl", "Hefe", "Wasser", "Tomatensoße", "Käse")

    println("Willkommen beim Pizza-Automat.")

    druckeZutaten(zutatenListe)

    // hier noch die 3 Funktionen wie in der Aufgabe beschrieben aufrufen
    pizzaTeigKneten(zutatenListe)
    grundPizzaFertigStellen(zutatenListe)
    belaege()

    println("Pizzavorbereitung abgeschlossen.")

    ofenCountdown()
}

