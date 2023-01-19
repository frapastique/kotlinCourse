fun druckeZutaten(zutaten: List<String>){
    println("Zuerst listen wir die Grundzutaten auf...")
    var a = 1
    for (i in zutaten.indices){
        println("$a. Grundzutat: ${zutaten[i]}")
        a++
    }
}

// funktion pizzaTeigKneten

// funktion grundPizzaFertigStellen

// funktion belaege

// funktion ofenCountdown

fun main(){
    var zutatenListe: List<String> = listOf("Mehl", "Hefe", "Wasser", "Tomatensoße", "Käse")

    println("Willkommen beim Pizza-Automat.")

    // druckeZutaten(zutatenListe)

    // hier noch die 3 Funktionen wie in der Aufgabe beschrieben aufrufen

    println("Pizzavorbereitung abgeschlossen.")

    //TODO: Countdown nicht vergessen
    //ofenCountdown()
}

