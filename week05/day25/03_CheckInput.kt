fun checkInput(): String {
    print("Deine Entscheidung: ")
    val input: String = readln().lowercase()
    while (true) {
        if (input.isNotEmpty()) {
            try {
                input.toInt()
                return input
            } catch (e: Exception) {
                when (input) {
                    "hit" -> {
                        return input
                    }
                    "stand" -> {
                        return input
                    }
                    "dealer" -> {
                        return input
                    }
                    "beide" -> {
                        return input
                    }
                    "konto" -> {
                        return input
                    }
                    "yes" -> {
                        return input
                    }
                    "stop" -> {
                        return input
                    }
                    else -> {
                        println("\nDeine Eingabe '$input' ist nicht möglich. Versuche es erneut!\n")
                        return checkInput()
                    }
                }
            }
        } else {
            println("\nDeine Eingabe '$input' ist nicht möglich. Versuche es erneut!\n")
            return checkInput()
        }
    }
}

