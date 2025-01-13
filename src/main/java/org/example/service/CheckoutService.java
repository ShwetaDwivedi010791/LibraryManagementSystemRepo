package org.example.service;

import org.example.book.Book;
import org.example.libraryManagement.LibraryInventory;
import org.example.members.LibraryMember;

public class CheckoutService {

    LibraryInventory libraryInventory;

    public void checkoutBook(LibraryMember member, Book book){
       Book bookToBeCheckedOut= libraryInventory.getBooks().get(book);
       if(bookToBeCheckedOut.isIssued()){
           System.out.println("Can not be issued");
       }
       else{
           bookToBeCheckedOut.setIssued(true);
           member.getBooksIssued().put(bookToBeCheckedOut.getIssueDate(),book);
       }
    }

}
