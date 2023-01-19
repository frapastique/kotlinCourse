fun main(){

    println("Willkommen beim Pizza-Automat.")
    println("Zuerst listen wir die Grundzutaten auf...")


    var zutatenListe: List<String> = listOf("Mehl", "Hefe", "Wasser", "Tomatensoße", "Käse")
    var a = 1
    for (i in zutatenListe.indices){
        println("$a. Grundzutat: ${zutatenListe[i]}")
        a++
    }

    println("Grundzutaten werden vermischt....")

    for (i in zutatenListe.indices){
        if (i in 0..2){
            print("${zutatenListe[i]}, ")
        }
    }
    println("werden in einer Schüssel vermischt und geknetet....")

    println("...")
    println("Pizzateig erstellt.")

    for (i in zutatenListe.indices){
        if (i in 3..zutatenListe.size){
            print("${zutatenListe[i]}, ")
        }
    }
    println(" werden auf dem Teig verteilt...")
    println("Die Grundpizza ist fertig.")
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

    println("Pizzavorbereitung abgeschlossen.")
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
