class Computer(var on: Boolean) {

    fun pressOnButton() {
        if (!on) {
            on = true
        }
    }

    fun pressOffButton() {
        if (on) {
            on = false
        }
    }

    fun sendEMail() {
        if (on) {
            println("EMail sent!")
        }
    }
}