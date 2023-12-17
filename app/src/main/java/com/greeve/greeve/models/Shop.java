package com.greeve.greeve.models;

public class Shop {

    private String title,price;
    private int photo;

    public Shop(String title, String price, int photo) {
        this.title = title;
        this.price = price;
        this.photo = photo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

}
