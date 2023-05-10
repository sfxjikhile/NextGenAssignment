package com.nextgen.books.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BOOK")
public class Book {
    @Id
    private Integer id;
    @Column(name = "book_name", nullable = false, unique = true)
    private String name;
    @Column(name = "book_pages", nullable = false)
    private Integer pages;
    @Column(name = "author", nullable = false)
    private String author;
    @Column(name = "category")
    private String category;
    @Column(name = "color")
    private String color;

    public Book() {

    }

    public Book(String name, Integer pages, String author, String category, String color) {
        this.name = name;
        this.pages = pages;
        this.author = author;
        this.category = category;
        this.color = color;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
