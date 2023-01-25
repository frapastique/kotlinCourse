class Book {
    var pages: List<Page>
    var page: Int = 0
    constructor(pages: List<Page>) {
        this.pages = pages
    }

    fun read(): String {
        return pages[page].text
    }

    fun nextPage() {
        if (page < pages.size - 1) {
            page++
        }
    }

    fun previousPage() {
        if (page > 0) {
            page--
        }
    }
}