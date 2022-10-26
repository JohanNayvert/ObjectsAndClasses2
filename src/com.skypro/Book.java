package com.skypro;

public class Book {
    private final String nameBook;
    private int year;
    private final Author author;

    public Book(String nameBook, int year, Author author) {
        this.nameBook = nameBook;
        this.year = year;
        this.author = author;
    }

    public Author getAuthor() {return  this.author;}
    public String getNameBook(){
        return this.nameBook;
    }
    public int getYear(){
        return this.year;
    }
    public void setYear(int year) {
        this.year = year;
    }
}
