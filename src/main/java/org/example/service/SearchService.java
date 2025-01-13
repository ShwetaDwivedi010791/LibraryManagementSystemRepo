package org.example.service;

import org.example.book.Author;
import org.example.book.Book;
import org.example.book.BookType;
import org.example.libraryManagement.LibraryInventory;
import java.util.List;
import java.util.stream.Collectors;

public class SearchService {
    LibraryInventory libraryInventory;
    public List<Book> geBookByTitle(String title){

       return libraryInventory.getBooks().values().stream().filter(e->e.getTitle().equals(title)).collect(Collectors.toList());
    }
    public List<Book> geBookByAuthor(Author author){
        return libraryInventory.getBooks().values().stream().filter(e->e.getAuthor().equals(author)).collect(Collectors.toList());
    }
    public List<Book> geBookByType(BookType bookType){
        return libraryInventory.getBooks().values().stream().filter(e->e.getBookTypes()
                        .stream().anyMatch(b->b.equals(bookType)))
                .collect(Collectors.toList());

    }
}
