fun main() {
    compareNumbers0(2, 5)
    compareNumbers0(5, 5)
    compareNumbers0(6, 5)

    compareNumbers1(7, 5)
    compareNumbers1(5, 5)
    compareNumbers1(2, 5)
}

fun compareNumbers0(number0: Int, number1: Int) {
    if (number0 <= number1) {
        println(true)
    } else {
        println(false)
    }
}

fun compareNumbers1(number0: Int, number1: Int) {
    if (number0 >= number1) {
        println(true)
    } else {
        println(false)
    }
}