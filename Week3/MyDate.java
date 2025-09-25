package org.example;

public class MyDate {

    private int day;
    private int month;
    private int year;

    // Default constructor for Jan 1, 1970
    public MyDate() {
        this.day = 1;
        this.month = 1;
        this.year = 1970;
    }


    public MyDate(MyDate other) {
        this.day = other.day;
        this.month = other.month;
        this.year = other.year;
    }

    // Constructor with day, month, year
    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Getters - got a little out of my element with these
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
}
