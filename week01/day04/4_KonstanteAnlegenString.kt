//fun main(){
//    // Lege hier nach den Vorgaben eine Konstante vom Typ String an und lasse dir den Typ ausgeben
//
//    println("${birthName::class.simpleName}")
//}

fun main(){
    // Lege hier nach den Vorgaben eine Konstante vom Typ String an und lasse dir den Typ ausgeben
    val birthName: String = "Volkovs"
    println("Mein Geburtsname lautet \"$birthName\" und entspricht der Klasse: ${birthName::class.simpleName}.")
}
