package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.library.service.BookService;

public class LibraryManagementApplication {

    public static void main(String[] args) {
        // Load the Spring context using AnnotationConfigApplicationContext
        ApplicationContext context = new AnnotationConfigApplicationContext("com.library");

        // Retrieve the BookService bean from the Spring context
        BookService bookService = context.getBean(BookService.class);

        // Test the configuration
        bookService.performService();
    }
}
