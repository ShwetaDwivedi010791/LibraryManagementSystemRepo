package org.example.libraryManagement;

import org.example.book.Book;

import java.util.Map;

public class LibraryInventory {

    Map<Integer,Book> books;

    public Map<Integer, Book> getBooks() {
        return books;
    }

    public void setBooks(Map<Integer, Book> books) {
        this.books = books;
    }
}
