package mm_meaningful_name

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
fun displayBookDetails(book: Book) {
    val title = book.title ?: throw IllegalArgumentException("Title required")
    val publishYear = book.publishYear ?: return

    println("$title: $publishYear")
}