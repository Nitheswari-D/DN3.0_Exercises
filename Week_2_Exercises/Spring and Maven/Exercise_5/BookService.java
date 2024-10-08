package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    // Setter method for dependency injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void performService() {
        // Example method to show the service usage
        System.out.println("Performing service...");
        bookRepository.performRepositoryTask();
    }
}
