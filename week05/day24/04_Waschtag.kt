fun main() {
    val shirts = mutableListOf(
        "rot", "blau", "rot", "blau", "blau", "rot", "rot", "blau", "blau",
        "blau", "rot", "blau", "rot", "blau", "blau", "rot", "rot", "blau"
    )
    println("Insgesamt haben wir ${shirts.size} rote und blaue T-Shirts im Wäschekorb.")

    val redShirts: MutableList<String> = mutableListOf()
    val blueShirts: MutableList<String> = mutableListOf()

    for (i in shirts) {
        if (i == "rot") {
            redShirts.add(i)
        }
        if (i == "blau") {
            blueShirts.add(i)
            continue
        }
    }
    println("Davon sind ${redShirts.size} rot und ${blueShirts.size} blau.")
}