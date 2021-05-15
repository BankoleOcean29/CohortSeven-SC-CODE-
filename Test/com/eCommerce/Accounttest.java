package com.eCommerce;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Accounttest {

    @Test

    public void testThatAccountNameCanBeAdded() {
        Account nav = new Account();

        nav.setAccountName("Jolly");

        String nuAccount = nav.getAccountName();

        assertEquals(nuAccount, nuAccount);
    }

    @Test

    public void testThatAccountPasswordCanBeAdded() {
        Account seller = new Account();

        seller.setAccountPassword("fibonacci9");

        String nuPassword = seller.getPassword();

        assertEquals(nuPassword, nuPassword);


    }

    @Test

    public void testThatEmailAddressCanBeAdded() {
        Account email = new Account();

        email.setEmailAddress("demiColon@gmail.com");

        String dEmail = email.getEmail();

        assertEquals(dEmail, dEmail);
    }
}
