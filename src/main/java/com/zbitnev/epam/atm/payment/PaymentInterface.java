package com.zbitnev.epam.atm.payment;

import java.math.BigDecimal;

public interface PaymentInterface {
    BigDecimal getPayment(BigDecimal bill, BigDecimal quantiti);
}