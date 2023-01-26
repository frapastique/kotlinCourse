open class Pokemon(
    var name: String,
    var level: Int,
    var hitPoints: Int,
    var type: String) {

    var damageValue = 0.5 * level
    var isKO = false

    fun looseHP(lost: Int) {
        hitPoints -= lost
        if (hitPoints == 0) {
            isKO = true
        }
    }
    open fun attack(pok: Pokemon) {

    }
}