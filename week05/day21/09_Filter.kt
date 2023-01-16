fun main() {
    val list: List<Int> = listOf(0, 1, 2, 3, 4, 5,)
    println(list)
    var mutableList: MutableList<Int> = mutableListOf()
    var i: Int = 1
    while (i < list.size) {
        mutableList.plusAssign(list[i])
        i += 2
    }
    println(mutableList)
}