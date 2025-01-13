package org.example.service;

import org.example.book.Book;
import org.example.libraryManagement.LibraryInventory;

import java.util.Map;

public class UpdateInventoryService {

    LibraryInventory libraryInventory;

    public void addBook(Book book){
       Map<Integer,Book> books= this.libraryInventory.getBooks();
       books.put(book.getIsbn(),book);
       this.libraryInventory.setBooks(books);
    }

    public void removeBook(Book book){
        Map<Integer,Book> books= this.libraryInventory.getBooks();
        books.remove(book);
        this.libraryInventory.setBooks(books);
    }
}
