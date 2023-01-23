class Bruch {
    //Die zwei Klassenvariablen nicht verändern
    var zaehler: Int = 1
    var nenner: Int = 1

    //Hier drunter kannst du weitercoden:
    fun alles() {
        einlesen()
        println("\nRechnung:")
        println("$zaehler/$nenner = ${wertRechnung()}")
        println("\nKehrwert:")
        println("$nenner/$zaehler = ${kehrwertRechnung()}")
    }

    fun ausgeben() {
        println("$zaehler/$nenner\n")
    }

    fun setze(z: Int, n: Int) {
        if (z != 0) {
            zaehler = z
            if (n != 0) {
                nenner = n
            }
        }
    }

    fun einlesen() {
        try {
            print("\nGebe den Zähler ein: ")
            var number0 = readln().toInt()
            while (true) {
                if (number0 > 0) {
                    try {
                        print("\nGebe den Nenner ein: ")
                        var number1 = readln().toInt()
                        while (true) {
                            if (number1 > 0) {
                                return setze(number0, number1)
                            } else {
                                println("\nBitte gebe eine Zahl über 0 ein.")
                                einlesen()
                            }
                        }
                    } catch (e: Exception) {
                        println("\nBitte gebe eine ganze Zahl ein.")
                        einlesen()
                    }
                } else {
                    println("\nBitte gebe eine Zahl über 0 ein.")
                    einlesen()
                }
            }
        } catch (e: Exception) {
            println("\nBitte gebe eine ganze Zahl ein.")
            einlesen()
        }
    }

    fun wert() {
        println(zaehler.toDouble().div(nenner.toDouble()))
        println()
    }
    fun wertRechnung(): Double {
        return zaehler.toDouble().div(nenner.toDouble())
    }

    fun kehrwert() {
        println("$nenner/$zaehler\n")
    }
    fun kehrwertRechnung(): Double{
        return nenner.toDouble().div(zaehler.toDouble())
    }
}