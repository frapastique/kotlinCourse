fun main() {
    reward(1)
    reward(2)
    reward(3)
    reward(4)
    reward(5)
    reward(420)
}

fun reward(duration: Int) {
    when (duration) {
        1 -> println("5€ Amazon Gutschein Prämie.")
        2 -> println("15€ Amazon Gutschein Prämie.")
        3 -> println("25€ Amazon Gutschein Prämie.")
        4 -> println("35€ Amazon Gutschein Prämie.")
        5 -> println("50€ Amazon Gutschein Prämie.")
        else -> println("Vertragsdauer des Bestandskunden nicht valide.")
    }
}