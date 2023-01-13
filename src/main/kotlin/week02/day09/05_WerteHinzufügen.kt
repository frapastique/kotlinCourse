fun main() {
    val personZuHaustier: MutableMap<String, String> = mutableMapOf(
        "Berta" to "Hunde",
        "Frank" to "Katzen",
        "Luis" to "Mäuse",
        "Sylvia" to "Eulen",
        "Hans" to "Fau",
    )
    println(personZuHaustier)

    personZuHaustier.putAll(
        mutableMapOf(
            "Tim" to "Schildkröte",
            "Fabian" to "Papagai",
            "Jannik" to "Schlange",
        )
    )
    println(personZuHaustier)

    // Was passiert, wenn du der MutableMap das Paar "Luis" -> "Mäuse" hinzufügst?
    //  -> Nichts, bzw. der Ursprüngliche Wert wird überschrieben!
    // Was passiert, wenn du der MutableMap das Paar "Bernd" -> "Igel" hinzufügst?
    //  -> Das Paar wird am Ende der Map hinzugefügt!


}