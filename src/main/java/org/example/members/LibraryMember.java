package org.example.members;

import org.example.book.Book;

import java.util.Date;
import java.util.Map;

public abstract class LibraryMember extends Person {

    Account account;
    Map<Date, Book> booksIssued;

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Map<Date, Book> getBooksIssued() {
        return booksIssued;
    }

    public void setBooksIssued(Map<Date, Book> booksIssued) {
        this.booksIssued = booksIssued;
    }
}
