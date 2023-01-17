fun main() {
    var numbers: MutableList<Int> = mutableListOf(3, 6, 4, 7, 42, 1, 26)
    println(numbers)

    var numbersPlus5: MutableList<Int> = mutableListOf()
    for (number in numbers) {
        numbersPlus5.add(number + 5)
    }
    numbers = numbersPlus5
    println(numbers)
}