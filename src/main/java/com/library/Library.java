package com.library;

import java.util.ArrayList;

public class Library {

    ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {

        books.add(book);

        System.out.println("Book Added Successfully");
    }

    public void viewBooks() {

        for (Book b : books) {

            b.displayBook();
        }
    }

    public void issueBook(int id) {

        for (Book b : books) {

            if (b.id == id && !b.issued) {

                b.issued = true;

                System.out.println("Book Issued");

                return;
            }
        }

        System.out.println("Book Not Available");
    }

    public void returnBook(int id) {

        for (Book b : books) {

            if (b.id == id && b.issued) {

                b.issued = false;

                System.out.println("Book Returned");

                return;
            }
        }

        System.out.println("Invalid Book ID");
    }
}
