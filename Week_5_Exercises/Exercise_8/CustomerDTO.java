package com.example.bookstoreapi.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CustomerDTO {
    private int id;

    @NotNull(message = "Name is required")
    @Size(min = 2, max = 50, message = "Name must be between 2 and 50 characters")
    private String name;

    @NotNull(message = "Email is required")
    @Email(message = "Email should be valid")
    private String email;

    @Size(max = 200, message = "Address must be less than 200 characters")
    private String address;

    // Getters and Setters
    // ...
}
