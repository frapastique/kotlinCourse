fun main() {
    var page1: Page = Page("Seite 1:  Das ist der Anfang des Buches.")
    var page2: Page = Page("Seite 2:  Jetzt sind wir auf Seite 2.")
    var page3: Page = Page("Seite 3:  Hier haben wir gerade Seite 3. erreicht.")
    var page4: Page = Page("Seite 4:  Nun sind wir bei der letzten Seite angekommen.")

    var book: Book = Book(listOf(page1, page2, page3, page4))

    println(book.read())
    book.nextPage()
    println(book.read())
    book.nextPage()
    println(book.read())
    book.previousPage()
    println(book.read())
    book.previousPage()
    println(book.read())
}