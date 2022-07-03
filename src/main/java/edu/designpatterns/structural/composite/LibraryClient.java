package edu.designpatterns.structural.composite;

public class LibraryClient {

  public static void main(String[] args) {

    Books nonfictionBook = new NonfictionBook("A Brief History of Time");
    Books fictionBookOne = new FictionBook("Hamlet", true);
    Books fictionBookTwo = new FictionBook("The Great Gatsby", false);

    BookCollection bookCollection = new BookCollection();
    bookCollection.addBookType(nonfictionBook);
    bookCollection.addBookType(fictionBookOne);
    bookCollection.addBookType(fictionBookTwo);

    checkoutBook(nonfictionBook);
    checkoutBook(fictionBookOne);
    checkoutBook(bookCollection);

    returnBook(nonfictionBook);
    returnBook(fictionBookOne);
    returnBook(bookCollection);

  }

  public static void checkoutBook(Books books) {
    books.checkout();
  }

  public static void returnBook(Books books) {
    books.returnBook();
  }


}
