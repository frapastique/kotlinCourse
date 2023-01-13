fun main() {
    /*
    An welcher Stelle in der Liste befindet sich der Name "Pam"?
     Erstelle eine neue Variable und teile dieser dann den Index zu.
     Benutze dafür die in der Vorlesung vorgestelle Methode.
     */
    var names: MutableList<String> = mutableListOf("Jim", "Angela", "Oscar", "Pam", "Dwight")
    //TODO füge hier deinen Code ein
    var indexPam = names.indexOf("Pam")
    println(indexPam)
}