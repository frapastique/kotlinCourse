/*
class Car {
  var color: String
  var speed: Int

  constructor(color: String, speed: Int) {
    this.color = color
    this.speed = speed
  }

  fun showOff() {
    println(
      "Mein Auto ist das coolste! Es ist " + color +
              " und " + speed + " kmh schnell!"
    )
  }

  fun drive() {
    if (speed > 180) {
      println("Du wurdest geblitzt!")
    } else {
      println("Du wurdest nicht geblitzt.")
    }
  }
}

Dieser Codeschnippsel definiert eine Klasse "Car".
Die Klasse hat zwei Eigenschaften, "color" und "speed",
welche als Variablen deklariert sind. Zudem gibt es zwei
Methoden in der Klasse, "showOff" und "drive".

Der Konstruktor der Klasse nimmt zwei Parameter entgegen, "color"
als String und "speed" als Integer. Diese werden den zuvor genannten
Variablen zugeteilt.

Die Methode "showOff" gibt in der einen Text in der Konsole mit
den Variablen "color" und "speed" aus.

In der Methode "drive" wird, wenn man über 180 fährt "Du wurdest geblitzt!",
ansonsten "Du wurdest nicht geblitzt." in der Konsole ausgegeben.

val car = Car("Audi", 180)
car.showOff()
car.drive()

Hier wird der Wert "car" in der Klasse "Car" als neues Objekt initialisiert.
An den Konstruktor wird als "color" der String "Audi" und für "speed" der Integer
180 übergeben.

Darauf wird auf das Objekt "car" die Methode "showOff" und darauf "drive" angewendet.
Im ersten wird "Mein Auto ist das coolste! Es ist Audi und 180 kmh schnell!" und
für das zweite "Du wurdest nicht geblitzt." in der Konsole ausgegeben.
 */