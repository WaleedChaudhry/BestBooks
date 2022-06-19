package com.example.recyclerview.Model;

public class Model_Class {
    int image;
    String BookName;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public Model_Class(int image, String bookName) {
        this.image = image;
        BookName = bookName;
    }


}
