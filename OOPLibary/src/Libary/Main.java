package Libary;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        List<Book> books = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            books.add(new Book(i + 1, "William Shakesperare", "Romeo and Juliet", Genre.ROMANTIC, true));
        }
        for (int i = 31; i <= 80; i++) {
            books.add(new Book(i, "Edgar Allan Poe", "The Raven", Genre.HORROR, false));
        }
        for (int i = 81; i < 100; i++) {
            boolean randomBoolean = random.nextBoolean();
            books.add(new Book(i, "Jules Verne", "Around the worold in Eighthy Days", Genre.ADVENTURE, randomBoolean));
        }
        BookStore bookStore = new BookStore(books);
        System.out.println(bookStore);
        System.out.println(books.get(28));
    }
}