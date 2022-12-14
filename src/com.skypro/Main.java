package com.skypro;

public class Main {
    public static void main(String[] args) {
        System.out.println("ObjectsAndClasses");
        System.out.println();

        Author tolstoy = new Author("Лев", "Толстой");
        Author dostoevsky = new Author("Федор", "Достоевский");
        Book warAndPeace = new Book("Война и Мир", 1958, tolstoy);
        Book idiot = new Book("Идиот", 1983, dostoevsky);

        warAndPeace.setYear(1999);

        System.out.println("warAndPeace.getYear() = " + warAndPeace.getYear());
        System.out.println("idiot.getNameBook() = " + idiot.getNameBook());
        System.out.println("tolstoy = " + tolstoy.getClass());

        System.out.println();
        System.out.println("HomeWork Complete");
    }
}
