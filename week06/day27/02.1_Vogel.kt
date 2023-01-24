class Vogel {
    var vogelArt: String
    var futterTypen: String
    var age: Int

    constructor(vogelArt: String, futterTypen: String, age: Int) {
        this.vogelArt = vogelArt
        this.futterTypen = futterTypen
        this.age = age
    }

    fun zwitchern() {
        println("chirp chirp")
    }
}