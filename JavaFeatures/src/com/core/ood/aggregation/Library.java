package com.core.ood.aggregation;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private List<Book> books = new ArrayList<>();

    // Method to add a book
    public void addBook(Book book) {
        books.add(book);
    }
}
