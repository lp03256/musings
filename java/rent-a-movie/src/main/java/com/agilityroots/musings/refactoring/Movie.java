package com.agilityroots.musings.refactoring;

public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String _title;
    private Price _price;

    public Movie(String title, Price price) {
        _title = title;
        _price = price;
    }

    public String getTitle() {
        return _title;
    }

    public int getPriceCode() {

        return _price.getPriceCode();
    }

    public void setPriceCode(Price price) {

        _price = price;
    }

    double getCharge(int daysRented) {
        return _price.getCharge(daysRented);
    }

    int getFrequentRenterPoints(int daysRented) {
        if ((getPriceCode() == Movie.NEW_RELEASE) && daysRented > 1)
            return 2;
        else
            return 1;
    }
}