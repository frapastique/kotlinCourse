class Meerschweinchen(name: String, age: Int, val jumpheight: Int) : Haustier(name, age) {

    fun jump(heightSleepPlace: Int): Boolean {
        return heightSleepPlace <= jumpheight
    }
}