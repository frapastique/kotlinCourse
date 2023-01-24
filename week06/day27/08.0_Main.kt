fun main() {
    var car0: Auto = Auto("Mazda 121", 50, "blau", 5, 5)
    var car1: Auto = Auto("Smart", 82, "weiß", 2, 2)
    var car2: Auto = Auto("Ford Mondeo", 150, "blau", 5, 5)
    var car3: Auto = Auto("Audi A6", 313, "schwarz", 5, 5)

    car0.getIn(2)
    car0.startEngine()
    car0.getOut(2)

    car1.getIn(2)
    car1.getIn(1)
    car0.startEngine()

    car0.show()
    car1.show()
    car2.show()
    car3.show()
}