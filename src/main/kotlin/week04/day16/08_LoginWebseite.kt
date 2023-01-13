fun main() {
    userLogin(false, false, false)
    userLogin(true, false, false)
    userLogin(true, true, false)
    userLogin(true, true, true)
}

fun userLogin(userAccepted: Boolean, passwordOk: Boolean, connectionSecure: Boolean) {
    if (userAccepted) {
        if (passwordOk) {
            if (connectionSecure) {
                println("Ok.")
            } else {
                println("Unsafe Connection")
            }
        } else
            println("False Password.")
    } else {
        println("User denied.")
    }
}