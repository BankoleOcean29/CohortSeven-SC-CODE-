package com.SemiColon;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InvoiceTest {
    Invoice invoice;


    @AfterEach
    void setUp() {invoice = null; }


    @Test

    public void testThatInvoiceIncludesPartNumber() {

        Invoice invoice = new Invoice();
    invoice.getPartNumber();

    assertEquals(null, invoice.getPartNumber());

    }

    @Test

    public void testThatInvoiceIncludesPartDescription() {
        Invoice invoice = new Invoice();
        invoice.getPartDescription();

    }
}
