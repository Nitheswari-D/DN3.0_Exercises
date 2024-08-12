package com.library.service;

import org.springframework.stereotype.Service;

@Service
public class BookService {

    private final BookRepository bookRepository;

    // Constructor-based injection
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void performService() {
        // Example method to show the service usage
        System.out.println("Performing service...");
        bookRepository.performRepositoryTask();
    }
}
