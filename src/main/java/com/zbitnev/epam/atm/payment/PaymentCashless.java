package com.zbitnev.epam.atm.payment;

import java.math.BigDecimal;

/**
 * the class PaymentCashless is imitation some operation with account, it's part of strategy;
 *
 * @author Ivan Zbitnev
 * @version 1.0
 */
public class PaymentCashless implements PaymentInterface {
    @Override
    public BigDecimal getPayment(BigDecimal bill, BigDecimal quantiti) {
        System.out.println("PaymentCashless = You just withdrew money from your ATM account, and we don't have clue where");
        return bill.subtract(quantiti);
    }
}