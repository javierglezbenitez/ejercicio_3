package org.example.model;

public class Session {

    private int capacity;

    private String date;

    private String hour;

    public Movie getMovie() {
        return movie;
    }

    public Theater getTheater() {
        return theater;
    }

    private final Movie movie;
    private final Theater theater;


    public Session(int capacity, String date, String hour, Movie movie, Theater theater) {
        this.capacity = capacity;
        this.date = date;
        this.hour = hour;
        this.movie = movie;
        this.theater = theater;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }
}
