package org.example;

import java.util.Date;

public class Book extends Product { //Open-closed principle
    private final CategoryBook category;
    private final String publishingHouse;
    private final String author;
    private final int yearRelease;
    private final int pageCount;

    public Book(String nameProduct, double price, CategoryBook category, String publishingHouse, String author, int yearRelease, int pageCount) {
        super(nameProduct, price);
        this.category = category;
        this.publishingHouse = publishingHouse;
        this.author = author;
        this.yearRelease = yearRelease;
        this.pageCount = pageCount;
    }
}
