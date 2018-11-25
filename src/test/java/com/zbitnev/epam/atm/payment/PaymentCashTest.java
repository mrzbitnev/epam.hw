package com.zbitnev.epam.atm.payment;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class PaymentCashTest {
    @Test
    public void testGetPayment() {
        BigDecimal firstOperand = new BigDecimal(10);
        BigDecimal secondOperand = new BigDecimal(3);
        BigDecimal result = new BigDecimal(7);
        Assert.assertEquals(result, firstOperand.subtract(secondOperand));
    }
}