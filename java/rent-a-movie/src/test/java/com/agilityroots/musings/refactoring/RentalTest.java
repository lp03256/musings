package com.agilityroots.musings.refactoring;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RentalTest {

    @Test
    public void testRentalForNewRelease() {
        Rental rental = new Rental(new Movie("Some Moview", Movie.NEW_RELEASE), 2);

        double charge = rental.getCharge();

        assertThat(charge).isEqualTo(6.0);
    }

    @Test
    public void testRentalForRegularMovie() {
        Rental rental = new Rental(new Movie("Some Moview", Movie.REGULAR), 2);

        double charge = rental.getCharge();

        assertThat(charge).isEqualTo(2.0);
    }

    @Test
    public void testRentalForRegularMovieMoreThanTwoDays() {
        Rental rental = new Rental(new Movie("Some Moview", Movie.REGULAR), 3);

        double charge = rental.getCharge();

        assertThat(charge).isEqualTo(3.5);
    }

    @Test
    public void testRentalForChildrensMovie() {
        Rental rental = new Rental(new Movie("Some Moview", Movie.CHILDRENS), 2);

        double charge = rental.getCharge();

        assertThat(charge).isEqualTo(1.5);
    }

    @Test
    public void testRentalForChildrenMovieMoreThanThreeDays() {
        Rental rental = new Rental(new Movie("Some Moview", Movie.CHILDRENS), 4);

        double charge = rental.getCharge();

        assertThat(charge).isEqualTo(3.0);
    }

    @Test
    public void testFrequentRenterPointsForNewReleases() {
        Rental rental = new Rental(new Movie("Some Moview", Movie.NEW_RELEASE), 2);

        int frequentRenterPoints = rental.getFrequentRenterPoints();

        assertThat(frequentRenterPoints).isEqualTo(2);
    }

    @Test
    public void testFrequentRenterPointsForOtherReleases() {
        Rental rental = new Rental(new Movie("Some Moview", Movie.REGULAR), 2);

        int frequentRenterPoints = rental.getFrequentRenterPoints();

        assertThat(frequentRenterPoints).isEqualTo(1);
    }
}
