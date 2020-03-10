package com.teachmeskills.rakhubovskiy.library;

public class LibRunner {
    public static void main(String[] args) {

        Author author1 = new Author("Александр", "Сергеевич", "Грибоедов");
        Genre genre1 = new Genre("Комедия");
        Book book1 = new Book(1, "Горе от ума", author1, genre1);

    }

}
