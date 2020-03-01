package com.teachmeskills.rakhubovskiy.library;

public class Library {

    private String nameLibrary;
    private String address;
    private String department;

    public Library(String nameLibrary, String address, String department) {
        this.nameLibrary = nameLibrary;
        this.address = address;
        this.department = department;
    }

    public String getNameLibrary() {
        return nameLibrary;
    }

    public void setNameLibrary(String nameLibrary) {
        this.nameLibrary = nameLibrary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Library{" +
                "nameLibrary='" + nameLibrary + '\'' +
                ", address='" + address + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
