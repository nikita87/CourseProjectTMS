package com.teachmeskills.rakhubovskiy.library;

public class Author {

    private String firstName;
    private String secondName;
    private String surname;

    public Author() {
        firstName = null;
        secondName = null;
        surname = null;
    }

    public Author(String firstName, String secondName, String surname) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.surname = surname;
    }

    public Author(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
