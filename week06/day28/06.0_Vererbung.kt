/*
open class Haustier(name: String, age: Int) {
    var name: String = name
    var age: Int = age

    fun pet(){
        println("Dein Haustier hat sich streicheln lassen.")
    }
}

class Meerschweinchen(name: String, age: Int, val jumpheight: Int) : Haustier(name, age) {

    fun jump(heightSleepPlace: Int): Boolean {
        return heightSleepPlace <= jumpheight
    }
}

fun main() {
    var kruemel: Meerschweinchen = Meerschweinchen("Kruemel", 3, 25)
    kruemel.pet()
    println("Dein Haustier heisst " + kruemel.name + " und ist " + kruemel.age + " Jahre alt.")
    println(kruemel.jump(30))
}


1. Was gibt das Programm aus?

    Dein Haustier hat sich streicheln lassen.
    Dein Haustier heisst Kruemel und ist 3 Jahre alt.
    false

2. Wir instanziieren eine Meerschweinchen-Instanz. In der Meerschweinchen-Klasse ist keine
   Methode pet(), dennoch können wir die Meerschweinchen-Instanz mit pet() streicheln. Warum?

    Weil die Methode "pet" die Klasse "Haustier" an die Instanz-Meerschweinchen vererbt wurde.

3. Die Meerschweinchen-Klasse hat keine Eigenschaften name und age, dennoch können wir über
   die Meerschweinchen-Instanz auf die Eigenschaften zugreifen. Warum?

    Weil die Eigenschaft "name" und "age" der Klasse "Haustier" an die Klasse "Meerschweinchen"
    vererbt wurde.

4. Was macht das Keyword? open

    Das Keyword "open" öffnet die Klasse und gewährt somit die Vererbung von Eigenschaften
    und Methoden.

5. Was macht der Codeausschnitt hier? : Haustier(name, age)

    Es initiiert die Eigenschaften "name" und "age".

 */