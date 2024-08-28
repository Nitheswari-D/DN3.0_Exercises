// File: src/main/java/com/example/bookstore/service/impl/BookServiceImpl.java

package com.example.bookstore.service.impl;

import com.example.bookstore.model.Book;
import com.example.bookstore.service.BookService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    private List<Book> books = new ArrayList<>();

    public BookServiceImpl() {
        books.add(new Book(1L, "Spring in Action", "Craig Walls"));
        books.add(new Book(2L, "Java Concurrency in Practice", "Brian Goetz"));
    }

    @Override
    public List<Book> findAll() {
        return books;
    }

    @Override
    public Book findById(Long id) {
        return books.stream()
            .filter(book -> book.getId().equals(id))
            .findFirst()
            .orElse(null);
    }

    @Override
    public Book addBook(Book book) {
        books.add(book);
        return book;
    }
}
