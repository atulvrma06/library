package com.library;

public class Book {

    int id;
    String name;
    String author;
    boolean issued;

    public Book(int id, String name, String author) {

        this.id = id;
        this.name = name;
        this.author = author;
        this.issued = false;
    }

    public void displayBook() {

        System.out.println("Book ID: " + id);
        System.out.println("Book Name: " + name);
        System.out.println("Author: " + author);
        System.out.println("Issued: " + issued);

        System.out.println("---------------------");
    }
}
