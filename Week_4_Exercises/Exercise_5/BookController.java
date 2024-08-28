package com.example.bookstoreapi.controller;

import com.example.bookstoreapi.model.Book;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private List<Book> books = new ArrayList<>();

    // GET method to retrieve all books with custom headers
    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Custom-Header", "GetAllBooks");
        return new ResponseEntity<>(books, headers, HttpStatus.OK);
    }

    // POST method to add a new book with custom headers
    @PostMapping
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
        books.add(book);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Custom-Header", "BookAdded");
        return new ResponseEntity<>(book, headers, HttpStatus.CREATED);
    }

    // PUT method to update an existing book with custom headers
    @PutMapping("/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable int id, @RequestBody Book updatedBook) {
        for (Book book : books) {
            if (book.getId() == id) {
                book.setTitle(updatedBook.getTitle());
                book.setAuthor(updatedBook.getAuthor());
                book.setPrice(updatedBook.getPrice());
                book.setIsbn(updatedBook.getIsbn());

                HttpHeaders headers = new HttpHeaders();
                headers.add("Custom-Header", "BookUpdated");
                return new ResponseEntity<>(book, headers, HttpStatus.OK);
            }
        }
        throw new BookNotFoundException();
    }

    // DELETE method to remove a book by id with custom headers
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable int id) {
        books.removeIf(book -> book.getId() == id);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Custom-Header", "BookDeleted");
        return new ResponseEntity<>(headers, HttpStatus.NO_CONTENT);
    }

    // GET method to retrieve a book by its ID with custom headers
    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable int id) {
        Book book = books.stream()
                .filter(b -> b.getId() == id)
                .findFirst()
                .orElseThrow(BookNotFoundException::new);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Custom-Header", "GetBookById");
        return new ResponseEntity<>(book, headers, HttpStatus.OK);
    }
}
