package com.zbitnev.epam.atm.payment;

import java.math.BigDecimal;

/**
 * the class PaymentCash is imitation cash withdraw, it's part of strategy;
 *
 * @author Ivan Zbitnev
 * @version 1.0
 */
public class PaymentCash implements PaymentInterface {
    @Override
    public BigDecimal getPayment(BigDecimal bill, BigDecimal quantiti) {
        System.out.println("PaymentCash = You have withdrew cash from your ATM account");
        return bill.subtract(quantiti);
    }
}