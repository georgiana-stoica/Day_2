package com.qa;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> availableBooks;
    private List<Book> borrowedBooks;
    public Library() {
        this.availableBooks = new ArrayList<>();
        this.borrowedBooks = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Library{" +
                "availableBooks=" + availableBooks +
                ", borrowedBooks=" + borrowedBooks +
                '}';
    }

    public List<Book> getAvailableBooks() {
        return availableBooks;
    }

    public void setAvailableBooks(List<Book> availableBooks) {
        this.availableBooks = availableBooks;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }
    public void addBook(Book book) {
        availableBooks.add(book);
    }
}
