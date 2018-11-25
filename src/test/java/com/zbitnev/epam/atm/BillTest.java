package com.zbitnev.epam.atm;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

public class BillTest {
    Bill bill = new Bill(10);

    @Before
    public void testPrepareAccount() {
        bill.setBill(BigDecimal.valueOf(10));
    }

    @Test
    public void testGetBill() {
        Assert.assertEquals(BigDecimal.valueOf(10), bill.getBill());
    }

    @Test
    public void testSetBill() {
        bill.setBill(BigDecimal.valueOf(80));
        Assert.assertEquals(BigDecimal.valueOf(80), bill.getBill());
    }
}