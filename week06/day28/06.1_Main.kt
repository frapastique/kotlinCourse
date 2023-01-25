fun main() {
    var kruemel: Meerschweinchen = Meerschweinchen("Kruemel", 3, 25)
    kruemel.pet()
    println("Dein Haustier heisst " + kruemel.name + " und ist " + kruemel.age + " Jahre alt.")
    println(kruemel.jump(30))
}