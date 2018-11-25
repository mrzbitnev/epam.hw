package com.zbitnev.epam.atm;

import com.zbitnev.epam.atm.payment.PaymentCash;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class PayTest {
    @Test
    public void testGetPaymentNormalCondition() {
        Pay pay = new Pay();
        BigDecimal result = pay.getPayment(new PaymentCash(), BigDecimal.valueOf(10), BigDecimal.valueOf(7));
        BigDecimal expect = new BigDecimal(3);
        Assert.assertEquals(expect, result);
    }
}