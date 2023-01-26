open class Dog: Tier() {
    final override fun makeNoise() {
        super.makeNoise()
        println("Woof!")
    }
}