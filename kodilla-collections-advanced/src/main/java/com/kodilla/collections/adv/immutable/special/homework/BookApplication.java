package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        Book book1 = bookManager.createBook("Harry Potter", "Rowling");
        Book book2 = bookManager.createBook("Lord of the rings", "Tolkien");
        Book book3 = bookManager.createBook("Harry Potter", "Rowling");
        Book book4 = bookManager.createBook("Harry Potter", "Rowling");
        System.out.println(book1 == book2);
        System.out.println(book1 == book3);
        System.out.println(book1 == book4);
        System.out.println(book2 == book3);
        System.out.println(book2 == book4);
        System.out.println(book3 == book4);
        System.out.println(book3.equals(book4));
    }
}
