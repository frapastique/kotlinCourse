fun main() {
    // todo: Erstelle hier deinen Code.
    var list0: MutableList<Int> = mutableListOf(4, 8, 3)
    var list1: MutableList<Int> = mutableListOf(2, 4, 9)
    println(list0)
    println(list1)
    list0.add(3)
    list1.add(6)
    println(list0)
    println(list1)
    println(list0.last().plus(list1.last()))
}