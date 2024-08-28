// File: src/main/java/com/example/bookstore/service/BookService.java

package com.example.bookstore.service;

import com.example.bookstore.model.Book;
import java.util.List;

public interface BookService {
    List<Book> findAll();
    Book findById(Long id);
    Book addBook(Book book);
}
