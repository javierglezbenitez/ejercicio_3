package org.example.model;

public class Movie {

    private String author;
    private int duration;

    private String tittle;

    public Movie(String author, int duration, String tittle) {
        this.author = author;
        this.duration = duration;
        this.tittle = tittle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }
}
