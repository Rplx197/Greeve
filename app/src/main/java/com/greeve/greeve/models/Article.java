package com.greeve.greeve.models;
//Ini Data
public class Article {

    private String title;
    private String photo;
    private String link;

    public Article(String title, String photo, String link) {
        this.title = title;
        this.photo = photo;
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
