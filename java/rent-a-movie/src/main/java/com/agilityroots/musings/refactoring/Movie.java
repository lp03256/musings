package com.agilityroots.musings.refactoring;

public class Movie {
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
        return _price.getFrequentRenterPoints(daysRented);
    }
}