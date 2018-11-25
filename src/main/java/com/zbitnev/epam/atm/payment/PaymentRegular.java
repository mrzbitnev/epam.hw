package com.zbitnev.epam.atm.payment;

import java.math.BigDecimal;

/**
 * the class PaymentRegular is imitation some regular operation, it's part of strategy;
 *
 * @author Ivan Zbitnev
 * @version 1.0
 */
public class PaymentRegular implements PaymentInterface {
    @Override
    public BigDecimal getPayment(BigDecimal bill, BigDecimal quantiti) {
        System.out.println("PaymentRegular = Congratulations, we just paid for your internet this month");
        return bill.subtract(quantiti);
    }
}