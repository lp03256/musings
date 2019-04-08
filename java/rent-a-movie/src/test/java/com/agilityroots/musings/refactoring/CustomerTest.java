package com.agilityroots.musings.refactoring;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CustomerTest {

    @Test
    public void testCustomerStatement() {
        Movie snatch = new Movie("Snatch", Movie.REGULAR);
        Movie shazam = new Movie("Shazam", Movie.NEW_RELEASE);

        Rental snatchRental = new Rental(snatch, 3);
        Rental shazamRental = new Rental(shazam, 3);

        Customer stan = new Customer("Stan Lee");
        stan.addRental(snatchRental);
        stan.addRental(shazamRental);

        String statement = stan.statement();
        String expected = "Rental Record for Stan Lee\n" +
                "\tSnatch\t3.5\n" +
                "\tShazam\t9.0\n" +
                "Amount owed is 12.5\n" +
                "You earned 3 frequent renter points";

        assertThat(statement).contains("Stan Lee");
        assertThat(statement).isEqualTo(expected);

    }
}
