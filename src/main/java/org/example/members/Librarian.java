package org.example.members;

import org.example.book.Book;
import org.example.libraryManagement.LibraryInventory;
import org.example.service.CheckoutService;
import org.example.service.SearchService;
import org.example.service.UpdateInventoryService;

public class Librarian extends LibraryMember {

    CheckoutService checkoutService;
    SearchService searchService;
    UpdateInventoryService updateInventoryService;

    LibraryInventory libraryInventory;
    public void issueBook(){

    }

    public void releaseBook(){

    }



}
