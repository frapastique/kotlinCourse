fun main() {
    var penguin: Penguin = Penguin(40.0)
    var eagle: Eagle = Eagle(6.7)

    println("Can a Penguin fly?\n  ${penguin.canFly}")
    println("Can a Golden Eagle fly?\n  ${eagle.canFly}")

    penguin.makeNoise()
    eagle.makeNoise()

    penguin.waddle()
    eagle.fly()
}