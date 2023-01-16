fun main () {
    // Ändere den Wert "Bananen" in der MutableList zu "Äpfel"
    var fruits: MutableList<String> = mutableListOf("Birnen", "Bananen", "Orangen")
    // Dein Code hier:
    fruits[1] = "Äpfel"
    println(fruits[1])
}