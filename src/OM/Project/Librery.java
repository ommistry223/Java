package OM.Project;

import java.util.ArrayList;
import java.util.Scanner;

public class Librery {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.seedSampleData(); // optional sample books

        Scanner sc = new Scanner(System.in);
        boolean running = true;

        System.out.println("=== Library Management System ===");
        while (running) {
            System.out.println("\nMenu: 1.Add  2.Remove  3.List  4.Search  5.Exit");
            System.out.print("Choose: ");
            String choice = sc.nextLine().trim();

            switch (choice) {
                case "1":
                    System.out.print("Title: ");
                    String title = sc.nextLine().trim();
                    System.out.print("Author: ");
                    String author = sc.nextLine().trim();
                    lib.addBook(title, author);
                    break;
                case "2":
                    System.out.print("Enter Book ID to remove: ");
                    String idStr = sc.nextLine().trim();
                    try {
                        int id = Integer.parseInt(idStr);
                        lib.removeBookById(id);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid ID format.");
                    }
                    break;
                case "3":
                    lib.listBooks();
                    break;
                case "4":
                    System.out.print("Search by (t)itle or (a)uthor? ");
                    String by = sc.nextLine().trim().toLowerCase();
                    System.out.print("Enter keyword: ");
                    String kw = sc.nextLine().trim();
                    if (by.equals("t")) lib.searchByTitle(kw);
                    else lib.searchByAuthor(kw);
                    break;
                case "5":
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

        sc.close();
        System.out.println("Goodbye!");
    }
}

// --- Book class: encapsulated data + constructor ---
class Book {
    private static int nextId = 1; // static counter
    private final int id;          // final — assigned once
    private String title;
    private String author;

    public Book(String title, String author) {
        this.id = nextId++;
        this.title = title;
        this.author = author;
    }

    // Getters & setters
    public int getId() { return id; }
    public String getTitle() { return title; }
    public void setTitle(String title) {
        if (title != null && !title.isEmpty()) this.title = title;
    }
    public String getAuthor() { return author; }
    public void setAuthor(String author) {
        if (author != null && !author.isEmpty()) this.author = author;
    }

    @Override
    public String toString() {
        return String.format("[%d] \"%s\" by %s", id, title, author);
    }
}

// --- Library class: manages books using ArrayList ---
class Library {
    private ArrayList<Book> books = new ArrayList<>();

    // Add a book
    public void addBook(String title, String author) {
        if (title == null || title.isEmpty()) { System.out.println("Title required."); return; }
        if (author == null || author.isEmpty()) { System.out.println("Author required."); return; }
        Book b = new Book(title, author);
        books.add(b);
        System.out.println("Added: " + b);
    }

    // Remove by id
    public void removeBookById(int id) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == id) {
                System.out.println("Removed: " + books.remove(i));
                return;
            }
        }
        System.out.println("Book with ID " + id + " not found.");
    }

    // List all books
    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("Library is empty.");
            return;
        }
        System.out.println("Books in library:");
        for (Book b : books) System.out.println(b);
    }

    // Search helpers
    public void searchByTitle(String kw) {
        boolean found = false;
        for (Book b : books) {
            if (b.getTitle().toLowerCase().contains(kw.toLowerCase())) {
                System.out.println(b);
                found = true;
            }
        }
        if (!found) System.out.println("No books found with title containing: " + kw);
    }

    public void searchByAuthor(String kw) {
        boolean found = false;
        for (Book b : books) {
            if (b.getAuthor().toLowerCase().contains(kw.toLowerCase())) {
                System.out.println(b);
                found = true;
            }
        }
        if (!found) System.out.println("No books found with author containing: " + kw);
    }

    // Seed sample data for quick testing
    public void seedSampleData() {
        addBook("The Alchemist", "Paulo Coelho");
        addBook("Clean Code", "Robert C. Martin");
        addBook("Java: The Complete Reference", "Herbert Schildt");
    }
}
