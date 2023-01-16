fun main() {

    // Beispiel Map.
    val personZuHaustier: Map<String, String> = mapOf(
        "Berta" to "Hund",
        "Alfred" to "Katze",
        "Tim" to "Maus",
    )

    // Hier holen wir uns das Set Schlüssel von der Map und konvertieren das Set anschließend zu einer Liste.
    val schluesselSet: Set<String> = personZuHaustier.keys
    val schluesselListe: List<String> = schluesselSet.toList()

    // Wir können das auch in einer Zeile Abkürzen.
    val nochEineListe: List<String> = personZuHaustier.keys.toList()

    // Ebenso geht das auch mit MutableList.
    val wiederEineListe: MutableList<String> = personZuHaustier.keys.toMutableList()

    // Und neben den Schlüsseln können wir auch die Werte erhalten.
    val werteListe: List<String> = personZuHaustier.values.toList()

    // todo: Schau dir die Listen in der Konsole an. Du kannst auch ruhig den bestehen Code ändern und experimentieren.

}