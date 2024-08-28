package com.example.bookstoreapi.controller;

import com.example.bookstoreapi.model.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private List<Book> books = new ArrayList<>();

    @GetMapping
    public List<Book> getAllBooks() {
        return books;
    }

    @PostMapping
    public Book addBook(@RequestBody Book book) {
        books.add(book);
        return book;
    }

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable int id, @RequestBody Book updatedBook) {
        for (Book book : books) {
            if (book.getId() == id) {
                book.setTitle(updatedBook.getTitle());
                book.setAuthor(updatedBook.getAuthor());
                book.setPrice(updatedBook.getPrice());
                book.setIsbn(updatedBook.getIsbn());
                return book;
            }
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable int id) {
        books.removeIf(book -> book.getId() == id);
        return "Book removed with id " + id;
    }

    // New endpoint to get a book by ID
    @GetMapping("/{id}")
    public Book getBookById(@PathVariable int id) {
        return books.stream()
                    .filter(book -> book.getId() == id)
                    .findFirst()
                    .orElse(null);
    }

    // New endpoint to search books by title and/or author
    @GetMapping("/search")
    public List<Book> searchBooks(@RequestParam(required = false) String title,
                                  @RequestParam(required = false) String author) {
        return books.stream()
                    .filter(book -> (title == null || book.getTitle().equalsIgnoreCase(title)) &&
                                    (author == null || book.getAuthor().equalsIgnoreCase(author)))
                    .toList();
    }
}
