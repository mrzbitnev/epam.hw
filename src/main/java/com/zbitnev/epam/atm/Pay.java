package com.zbitnev.epam.atm;

import com.zbitnev.epam.atm.payment.PaymentInterface;

import java.math.BigDecimal;

/**
 * the class Pay takes the form of payment and implements the provided strategy;
 * Throw IllegalArgumentException
 *
 * @author Ivan Zbitnev
 * @version 1.0
 */
public class Pay {
    public Pay() {
    }

    public BigDecimal getPayment(PaymentInterface paymentInterface,
                                 BigDecimal bill, BigDecimal quantity) throws IllegalArgumentException {
        int compare = bill.compareTo(quantity);
        if (compare >= 0) {
            return paymentInterface.getPayment(bill, quantity);
        } else if (compare < 0) {
            return BigDecimal.valueOf(-1);
        }
        throw new IllegalArgumentException("Something wrong with argument BigDecimal bill= " +
                bill + " or with BigDecimal quantity= " + quantity);
    }

    public static void showTheMoney(BigDecimal bill) {
        System.out.println("In your account now = " + bill + "\n");
    }
}