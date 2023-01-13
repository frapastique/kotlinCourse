fun main (){
    // Addiere das Alter deiner Eltern und subtrahiere das Alter von dir und deinen Geschwistern von der Summe.
    // Lege das Alter der Personen jeweils als Variable an. Gib das Ergebnis mit dem println()-Befehl aus.
    var ageMom: Int = 43
    var ageDad: Int = 46
    var ageSister: Int = 13
    var ageBrother: Int = 18
    var ageMe: Int = 27

    var ageParentsMinusAgeChildren: Int = ageMom.plus(ageDad).minus(ageSister.plus(ageBrother.plus(ageMe)))
    println(ageParentsMinusAgeChildren)
}
