fun einsBisZehnOhneSchleife() {
    println(1)
    println(2)
    println(3)
    println(4)
    println(5)
    println(6)
    println(7)
    println(8)
    println(9)
    println(10)
}

fun einsBisZehnMitSchleife() {
    var counter = 1
    while (counter <= 10) {
        println(counter)
        counter++
    }
}

fun main() {
// hier beide Funktionen nacheinander aufrufen!
//    einsBisZehnOhneSchleife()
    einsBisZehnMitSchleife()
}

/* beantworte hier folgende Fragen:
  Wie viele Zeilen Code sparen wir, indem wir die Schleife benutzen?
        Fünf (5) Zeilen Code!
  Was sind die Vorteile der Schleifen?
        Man spart code, ist schneller bzw. effizienter und macht somit das debugging einfacher!
   */

