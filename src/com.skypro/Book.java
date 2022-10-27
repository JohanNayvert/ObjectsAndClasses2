package com.skypro;

import java.util.Objects;

public class Book {
    private final String nameBook;
    private int year;
    private final Author author;

    @Override
    public String toString() {
        return  "Название книги - '" + nameBook + '\'' +
                ", Год издательства - " + year +
                ", Автор - " + author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && nameBook.equals(book.nameBook) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, year, author);
    }

    public Book(String nameBook, int year, Author author) {
        this.nameBook = nameBook;
        this.year = year;
        this.author = author;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
