class Airplane {
    var amountTurbines: Int
    var flyingSpeed: Double
    var isAirbone: Boolean

    constructor(amountTurbines: Int, flyingSpeed: Double, isAirbone: Boolean) {
        this.amountTurbines = amountTurbines
        this.flyingSpeed = flyingSpeed
        this.isAirbone = isAirbone
    }

    fun takeOff() {
        if (!isAirbone) {
            isAirbone = true
            Thread.sleep(1000)
            println("$amountTurbines Turbines Started...")
            Thread.sleep(1000)
            println("Takeoff initiated.")
            Thread.sleep(1000)
            println("Takeoff!")
            Thread.sleep(1000)
            println("Plane is in the air with a comfortable $flyingSpeed km/h.")
        } else {
            println("Plane is in the air.")
        }
    }

    fun land() {
        if (isAirbone) {
            isAirbone = false
            Thread.sleep(1000)
            println("Landing initiated. Slowing down from $flyingSpeed km/h.")
            Thread.sleep(1000)
            println("Touchdown.")
            Thread.sleep(1000)
            println("Plane successfully landed.")
            Thread.sleep(1000)
            println("$amountTurbines Turbines shut off.")
        } else {
            println("Plane is on the ground.")
        }
    }
}