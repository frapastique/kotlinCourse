import kotlin.math.min

fun main(){
    rightOrder(123.45, 5.67)
}

fun rightOrder(zahl0: Double, zahl1: Double) {
    val smallNumber: Double = min(zahl0, zahl1)
    println(smallNumber)
}