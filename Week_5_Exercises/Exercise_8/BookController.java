package com.example.bookstoreapi.controller;

import com.example.bookstoreapi.dto.BookDTO;
import com.example.bookstoreapi.mapper.BookMapper;
import com.example.bookstoreapi.model.Book;
import com.example.bookstoreapi.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookService bookService;

    // Create a new book
    @PostMapping
    public ResponseEntity<BookDTO> createBook(@Valid @RequestBody BookDTO bookDTO) {
        Book book = BookMapper.INSTANCE.bookDTOToBook(bookDTO);
        Book savedBook = bookService.createBook(book);
        BookDTO responseDTO = BookMapper.INSTANCE.bookToBookDTO(savedBook);
        return ResponseEntity.ok(responseDTO);
    }

    // Read all books
    @GetMapping
    public ResponseEntity<List<BookDTO>> getAllBooks() {
        List<Book> books = bookService.getAllBooks();
        List<BookDTO> bookDTOs = books.stream()
                                      .map(BookMapper.INSTANCE::bookToBookDTO)
                                      .toList();
        return ResponseEntity.ok(bookDTOs);
    }

    // Read a book by ID
    @GetMapping("/{id}")
    public ResponseEntity<BookDTO> getBookById(@PathVariable int id) {
        Book book = bookService.getBookById(id);
        BookDTO bookDTO = BookMapper.INSTANCE.bookToBookDTO(book);
        return ResponseEntity.ok(bookDTO);
    }

    // Update a book
    @PutMapping("/{id}")
    public ResponseEntity<BookDTO> updateBook(@PathVariable int id, @Valid @RequestBody BookDTO bookDTO) {
        Book book = BookMapper.INSTANCE.bookDTOToBook(bookDTO);
        Book updatedBook = bookService.updateBook(id, book);
        BookDTO responseDTO = BookMapper.INSTANCE.bookToBookDTO(updatedBook);
        return ResponseEntity.ok(responseDTO);
    }

    // Delete a book
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable int id) {
        bookService.deleteBook(id);
        return ResponseEntity.noContent().build();
    }
}
