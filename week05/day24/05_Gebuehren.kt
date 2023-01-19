fun main() {
    val fees = listOf(363.34, 235.45, 753.45, 234.56, 658.33, 22.65, 2623.46, 475.54)
    println("Zur Kontrolle: ${fees.sum()}")
    println("Der Chef muss insgesamt ${sumFees(fees)}€ Gebühren bezahlen.")
}

fun sumFees(feeList: List<Double>): Double {
    var totalFees: Double = 0.00
    for (i in feeList.indices) {
        totalFees += feeList[i]
    }
    return totalFees
}