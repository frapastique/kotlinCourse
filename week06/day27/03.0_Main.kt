fun main() {
    var dog0: Hund = Hund("Fred", 2, "Dalmatiner")
    var dog1: Hund = Hund("Didi", 0, "Labrador")
    var dog2: Hund = Hund("Susi", 3, "American Bulldog")

    println("""
        Wir haben hier drei Hunde...
        
        Name:   ${dog0.name}
        Alter:  ${dog0.age}
        Rasse:  ${dog0.race}
        
        Name:   ${dog1.name}
        Alter:  ${dog1.age}
        Rasse:  ${dog1.race}
        
        Name:   ${dog2.name}
        Alter:  ${dog2.age}
        Rasse:  ${dog2.race}
        
        """.trimIndent())
    dog1.aging()
    dog1.bellen()
    dog0.bellen()
    dog2.bellen()
}