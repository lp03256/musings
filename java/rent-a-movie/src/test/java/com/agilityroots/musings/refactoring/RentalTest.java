package com.agilityroots.musings.refactoring;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RentalTest {

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
