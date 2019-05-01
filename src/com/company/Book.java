package com.company;

public class Book {
    private String title, author, description;
    private int price;
    private boolean isInStock;

    public Book(){

    }

    public Book(String title, String author, String description,
                int price, boolean isInStock) {

        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
        this.isInStock = isInStock;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean getInStock() {
        return isInStock;
    }

    public void setInStock() {
        this.isInStock = isInStock;
    }

    public String displayText() {
        return "Author: " + getAuthor() + "\r\nTitle: " + getTitle()
                + "\r\nDescription: " + getDescription();
    }







}
