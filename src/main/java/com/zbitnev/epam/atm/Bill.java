package com.zbitnev.epam.atm;

import java.math.BigDecimal;
import java.util.concurrent.locks.ReentrantLock;

/**
 * the class Bill is imitation entity from database, all operation in this program are make above it;
 *
 * @author Ivan Zbitnev
 * @version 1.0
 */
public class Bill {
    private BigDecimal bill;
    ReentrantLock lock = new ReentrantLock();

    public Bill(int accountSize) {
        bill = BigDecimal.valueOf(accountSize);
    }

    public BigDecimal getBill() {
        return bill;
    }

    public void setBill(BigDecimal bill) {
        Pay.showTheMoney(bill);
        this.bill = bill;
    }
}