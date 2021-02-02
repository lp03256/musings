package com.agilityroots.musings.refactoring;

abstract class Price {
    public static final int CHILDRENS = 2;
    public static final int NEW_RELEASE = 1;
    public static final int REGULAR = 0;

    abstract int getPriceCode();

    abstract double getCharge(int daysRented);

    int getFrequentRenterPoints(int daysRented) {
            return 1;
    }
}

class ChildrensPrice extends Price {

    int getPriceCode() {
        return CHILDRENS;
    }

    double getCharge(int daysRented) {
        
        return 1.5 + Math.max(0, (daysRented - 3)) * 1.5;
    }
}

class NewReleasePrice extends Price {

    int getPriceCode() {
        return NEW_RELEASE;
    }

    double getCharge(int daysRented) {
        return daysRented * 3;
    }

    @Override
    int getFrequentRenterPoints(int daysRented) {
        return (daysRented > 1) ? 2 : 1;
    }
}

class RegularPrice extends Price {

    int getPriceCode() {
        return REGULAR;
    }

    double getCharge(int daysRented) {

        return 2 + Math.max(0, (daysRented - 2)) * 1.5;
    }
}