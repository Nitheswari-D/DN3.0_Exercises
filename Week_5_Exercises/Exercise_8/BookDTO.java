package com.example.bookstoreapi.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class BookDTO {
    private int id;

    @NotNull(message = "Title is required")
    @Size(min = 2, max = 100, message = "Title must be between 2 and 100 characters")
    private String title;

    @NotNull(message = "Author is required")
    @Size(min = 2, max = 50, message = "Author must be between 2 and 50 characters")
    private String author;

    @Min(value = 0, message = "Price must be greater than or equal to 0")
    private double price;

    @NotNull(message = "ISBN is required")
    @Size(min = 10, max = 13, message = "ISBN must be between 10 and 13 characters")
    private String isbn;

    // Getters and Setters
    // ...
}
