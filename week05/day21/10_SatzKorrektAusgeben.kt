fun main(){
    var umgedrehterSatz = listOf(".", "rückwärts", "mehr ", "nicht ", "ist ", "Satz ", "Dieser ")
    println("Ursprünglicher Satz: $umgedrehterSatz")
    var lesbarerSatz: MutableList<String> = satzAusgabe(umgedrehterSatz)
    println("Korrekter Satz:      $lesbarerSatz")
}

fun satzAusgabe(list: List<String>): MutableList<String> {
    // hier dein code
    var mutableList: MutableList<String> = mutableListOf()
    var i: Int = list.size - 1
    while (i >= 0) {
        mutableList.addAll(listOf(list[i]))
        i--
    }
    return mutableList
}