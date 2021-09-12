package mm_meaningful_names

class Book(val title: String?, val publishYear: Int?)

// unclean
/*
fun displayBookDetails(book: Book) {
    val title = book.title
    if (title == null)
        throw IllegalArgumentException("Title required")
    val publishYear = book.publishYear
    if (publishYear == null) return

    println("$title: $publishYear")
} */

// clean
// null 처리 시 아래와 같이 하면 좀 더 간결하고 직관적인 것 같다.
fun displayBookDetails(book: Book) {
    val title = book.title ?: throw IllegalArgumentException("Title required")
    val publishYear = book.publishYear ?: return

    println("$title: $publishYear")
}