fun main() {
    var birb0: Vogel = Vogel("Amsel", "Beeren", 20)
    var birb1: Vogel = Vogel("Blaumeise", "Samen", 7)
    var birb2: Vogel = Vogel("Cacatuidae", "Nüsse", 60)
    var birb3: Vogel = Vogel("Specht", "Ameisen", 10)
    var birb4: Vogel = Vogel("Steinadler", "Hasen", 20)

    println("Name:   ${birb0.vogelArt}\nFutter: ${birb0.futterTypen}\nAlter:  ${birb0.age}\n")
    println("Name:   ${birb1.vogelArt}\nFutter: ${birb1.futterTypen}\nAlter:  ${birb1.age}\n")
    println("Name:   ${birb2.vogelArt}\nFutter: ${birb2.futterTypen}\nAlter:  ${birb2.age}\n")
    println("Name:   ${birb3.vogelArt}\nFutter: ${birb3.futterTypen}\nAlter:  ${birb3.age}\n")
    println("Name:   ${birb4.vogelArt}\nFutter: ${birb4.futterTypen}\nAlter:  ${birb4.age}\n")

    birb0.zwitchern()
}