package Libary;

import java.util.List;

public class BookStore {

    public BookStore() {

    }

    public BookStore(List<Book> books) {
        this.books = books;
    }

    private List<Book> books;

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        //TODO: Refactor
        String toString = getAllBooks() + " darab könyv van összesen amiből " + getRentableBooks() + " kölcsönözhető\r\n";
        toString = toString.concat(String.valueOf(getBooks(Genre.HORROR))).concat(" darab horror sztori van " + getRentableBooks(Genre.HORROR) + " kikölcsönezhető\r\n");
        toString = toString.concat(String.valueOf(getBooks(Genre.ADVENTURE))).concat(" darab kaland sztori van " + getRentableBooks(Genre.ADVENTURE) + " kikölcsönezhető\r\n");
        toString = toString.concat(String.valueOf(getBooks(Genre.ROMANTIC))).concat(" darab romantikus sztori van " + getRentableBooks(Genre.ROMANTIC) + " kikölcsönezhető");
        return toString;
    }

    private int getAllBooks() {
        return books.size();
    }

    private int getRentableBooks() {
        int counter = 0;
        for (Book book : books) {
            if (book.isRentable()) {
                counter++;
            }
        }
        return counter;
    }

    private int getRentableBooks(Genre genre) {
        int counter = 0;
        for (Book book : books) {
            if (book.getGenre() == genre && book.isRentable()) {
                counter++;
            }
        }
        return counter;
    }

    private int getBooks(Genre genre) {
        int counter = 0;
        for (Book book : books) {
            if (book.getGenre() == genre) {
                counter++;
            }
        }
        return counter;
    }

    private int getBooks(Genre genre, boolean onlyRentable) {
        int counter = 0;
        for (Book book : books) {
            if (book.getGenre() == genre) {
                if (onlyRentable) {
                    if (book.isRentable()) {
                        counter++;
                    }
                } else {
                    counter++;
                }
            }
        }
        return counter;
    }
}