package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashSet;

public class BookManager {
    HashSet<Book> books = new HashSet<>();

    public Book createBook(String title, String author) {
        Book book = new Book(title, author);
        if (!books.contains(book)){
            books.add(book);
        }
        for(Book book1 : books){
            if (book1.equals(book)){
                return book1;
            }
        }
        return null;
    }

}
