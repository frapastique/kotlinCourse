//fun main() {
//
//    // TODO a: Befülle die Values
//    val NAME: String =
//    val FIRST_NAME: String =
//    val LAST_NAME: String =
//
//    // TODO b: Benenne die Values
//    val : String = "0123 45678910"
//    val : String = "Blau"
//    val : String = "Hamburger"
//
//    // TODO c: Befülle die Variablen neu
//    var country: String = "Spanien"
//    country =
//
//    var city: String = "Berlin"
//    city =
//
//    // TODO d: Befülle die Variable mit einer Eingabe des Users
//    var continent: String =
//
//    // TODO e: Schlüsselwort var oder val einfügen
//    TIME: String = "09:00"
//    placeOfBirth: String = "München"
//    PET_NAME: String = "Brutus"
//    currentTVShow: String = "Breaking Bad"
//    lastVacation: String = "Tokyo"
//
//
//    // TODO: Nutze Println um dem User eine kleine Textbeschreibung auszugeben
//
//
//}
import java.util.Calendar

fun main() {

    // TODO a: Befülle die Values
    val NAME: String = "Gaidis Volkovs"
    val FIRST_NAME: String = "Gaidis"
    val LAST_NAME: String = "Volkovs"

    // TODO b: Benenne die Values
    val phoneNumber: String = "0123 45678910"
    val color: String = "Purpur"
    val meal: String = "Pelmeni"

    // TODO c: Befülle die Variablen neu
    var country: String = "Spanien"
    country = "Germany"

    var city: String = "Berlin"
    city = "Stuttgart"

    // TODO d: Befülle die Variable mit einer Eingabe des Users
    var continent: String
    print("Name a continent: ")
    continent = readln().toString()

    // TODO e: Schlüsselwort var oder val einfügen
    val calendar = Calendar.getInstance()
    val hour = calendar.get(Calendar.HOUR_OF_DAY)
    val minute = calendar.get(Calendar.MINUTE)
    val second = calendar.get(Calendar.SECOND)
    val day = calendar.get(Calendar.DAY_OF_MONTH)
    val month = calendar.get(Calendar.MONTH) + 1
    val year = calendar.get(Calendar.YEAR)
    var currentTimeDate = "$hour:$minute:$second $day.$month.$year"
    var TIME: String = currentTimeDate

    val placeOfBirth: String = "Riga/Latvia"
    val PET_NAME: String = "Avien"
    var currentTVShow: String = "Avatar: The Last Airbender"
    var lastVacation: String = "Wuxi/China"


    // TODO f: Nutze Println um dem User eine kleine Textbeschreibung auszugeben
    println("\n\nGreetings fellow human beeing called $NAME!\n\n" +
            "Here are some Random Lines:\n\n" +
            "Current Time and Date   $TIME\n\n" +
            "First Name:             $FIRST_NAME\n" +
            "Last Name:              $LAST_NAME\n\n" +
            "Born in:                $placeOfBirth\n" +
            "Currently living in:    $city/$country\n" +
            "Continent of residence: $continent\n\n" +
            "A random Phone Number:  $phoneNumber\n\n" +
            "An awesome color:       $color\n" +
            "A great meal:           $meal\n\n" +
            "Cool name for a pet:    $PET_NAME\n\n" +
            "A must watch TV show:   $currentTVShow\n\n" +
            "Last stay abroad:       $lastVacation")

}