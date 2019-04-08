package com.agilityroots.musings.refactoring;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CustomerTest {

    Customer stan;

    @Before
    public void setup() {
        Movie snatch = new Movie("Snatch", new RegularPrice());
        Movie shazam = new Movie("Shazam", new NewReleasePrice());

        Rental snatchRental = new Rental(snatch, 3);
        Rental shazamRental = new Rental(shazam, 3);

        stan = new Customer("Stan Lee");
        stan.addRental(snatchRental);
        stan.addRental(shazamRental);
    }

    @Test
    public void testCustomerStatement() {

        String statement = stan.statement();
        String expected = "Rental Record for Stan Lee\n" +
                "\tSnatch\t3.5\n" +
                "\tShazam\t9.0\n" +
                "Amount owed is 12.5\n" +
                "You earned 3 frequent renter points";

        assertThat(statement).contains("Stan Lee");
        assertThat(statement).isEqualTo(expected);

    }

    @Test
    public void testCustomerHtmlStatement() {

        String htmlStatement = stan.htmlStatement();
        String expected = "<H1>Rentals for <EM>Stan Lee</EM></H1><P>\n" +
                "Snatch: 3.5<BR>\n" +
                "Shazam: 9.0<BR>\n" +
                "<P>You owe <EM>12.5</EM></P>\n" +
                "On this rental you earned <EM>3</EM> frequent renter points</P>";

        assertThat(htmlStatement).contains("Stan Lee");
        assertThat(htmlStatement).isEqualTo(expected);
    }
}
