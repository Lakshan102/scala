object LibraryManager {

  case class Book(title: String, author: String, isbn: String)

  object Library {
    var books: Set[Book] = Set(
      Book("The Catcher in the Rye", "J.D. Salinger", "978-0-316-76948-0"),
      Book("To Kill a Mockingbird", "Harper Lee", "978-0-06-112008-4"),
      Book("1984", "George Orwell", "978-0-452-28423-4")
    )

    def addBook(book: Book): Unit = {
      books += book
      println(s"Added book: \t${book.title} by ${book.author}\n\n")
    }

    def removeBook(isbn: String): Unit = {
      books.find(_.isbn == isbn) match {
        case Some(book) =>
          books -= book
          println(s"Removed book: \t${book.title} by ${book.author}\n\n")
        case None =>
          println(s"\nNo book found with ISBN: $isbn")
      }
    }

    def isBookInLibrary(isbn: String): Boolean = {
      books.exists(_.isbn == isbn)
    }

    def displayLibraryCollection(): Unit = {
      if (books.isEmpty) {
        println("\nThe library is empty.")
      } else {
        books.foreach { book =>
          println(s"Title:\t${book.title}, \nAuthor: \t${book.author}, \nISBN: \t${book.isbn}\n")
        }
      }
    }

    def searchBookByTitle(title: String): Unit = {
      books.find(_.title.equalsIgnoreCase(title)) match {
        case Some(book) =>
          println(s"\nFound book: \nTitle: \t${book.title}, \nAuthor: \t${book.author}, \nISBN: \t${book.isbn}\n")
        case None =>
          println(s"No book found with title: $title\n")
      }
    }

    def displayBooksByAuthor(author: String): Unit = {
      val authorBooks = books.filter(_.author.equalsIgnoreCase(author))
      if (authorBooks.isEmpty) {
        println(s"\nNo books found by author: $author\n")
      } else {
        authorBooks.foreach { book =>
          println(s"Title: \t${book.title}, \nAuthor: \t${book.author}, \nISBN: \t${book.isbn}\n")
        }
      }
    }
  }

  def main(args: Array[String]): Unit = {
    Library.displayLibraryCollection()

    val newBook = Book("Brave New World", "Aldous Huxley", "978-0-06-085052-4")
    Library.addBook(newBook)
    Library.displayLibraryCollection()

    Library.removeBook("978-0-06-112008-4")
    Library.displayLibraryCollection()

    println(s"Is '1984' in library? ${Library.isBookInLibrary("978-0-452-28423-4")}")

    Library.searchBookByTitle("1984")

    Library.displayBooksByAuthor("George Orwell")
  }
}
