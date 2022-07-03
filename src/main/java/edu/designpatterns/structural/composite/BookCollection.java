package edu.designpatterns.structural.composite;

import java.util.ArrayList;

public class BookCollection implements Books {

  private final ArrayList<Books> books = new ArrayList();

  public void addBookType(Books books) {
    this.books.add(books);
  }

  public void checkout() {
    books.forEach(Books::checkout);
  }

  public void returnBook() {
    books.forEach(Books::returnBook);
  }


}
