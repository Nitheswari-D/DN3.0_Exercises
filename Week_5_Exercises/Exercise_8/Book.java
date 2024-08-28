package com.example.bookstoreapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;
    private String author;
    private double price;
    private String isbn;

    @Version
    private int version; // Optimistic locking field

    // Getters and Setters
    // ...
}
