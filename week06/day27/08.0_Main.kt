fun main() {
    var car0: Auto = Auto(100, "purple", 4, 4)
    var car1: Auto = Auto(250, "violett", 2, 2)

    car0.getIn(2)
    car0.startEngine()
    car0.getOut(2)

    car1.getIn(2)
    car1.getIn(1)
    car0.startEngine()
}