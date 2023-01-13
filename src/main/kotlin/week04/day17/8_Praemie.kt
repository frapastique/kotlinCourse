fun main() {
    monthsToRewards(4)
    monthsToRewards(18)
    monthsToRewards(26)
    monthsToRewards(120)
}

fun monthsToRewards(months: Int) {
    if (months in 12 .. 23) {
        println("5€ Amazon-Gutschein")
    } else if (months in 24 .. 35) {
        println("15€ Amazon-Gutschein")
    } else if (months in 36 .. 47) {
        println("25€ Amazon-Gutschein")
    } else if (months >= 48) {
        println("50€ Amazon-Gutschein")
    } else {
        println("Keine Prämie")
    }
}