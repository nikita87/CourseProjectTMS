package com.teachmeskills.rakhubovskiy.library;

public class Genre {

    private String nameGenre;

    public Genre(String nameGenre) {
        this.nameGenre = nameGenre;
    }

    public String getNameGenre(){
        return nameGenre;
    }

    public void setNameGenre(String nameGenre) {
        this.nameGenre = nameGenre;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "nameGenre='" + nameGenre + '\'' +
                '}';
    }
}
