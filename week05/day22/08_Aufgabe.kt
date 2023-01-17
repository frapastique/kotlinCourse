fun main(){
    val nameList: List<String> = listOf("Paul","Dieter", "Jannes", "Lukas", "Hans")
    var sortedList: MutableList<String> = mutableListOf("","", "", "", "")

    var i: Int = 0
    var j: Int = nameList.size - 1
    do {
        sortedList.set(i, nameList[j])
        i++
        j--
    } while (i < nameList.size)

    // Den Code hier drunter nicht ändern!!!

    var finishedlist: List<String> = listOf("Hans", "Lukas","Jannes", "Dieter", "Paul")
    if(sortedList == finishedlist){
        println("Du hast die Aufgabe gelöst")
    }else{
        println("Leider noch nicht richtig, versuchs weiter :D")
    }
}