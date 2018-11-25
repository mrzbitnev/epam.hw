package com.zbitnev.epam.atm;

import com.zbitnev.epam.atm.payment.PaymentCash;
import com.zbitnev.epam.atm.payment.PaymentCashless;
import com.zbitnev.epam.atm.payment.PaymentInterface;
import com.zbitnev.epam.atm.payment.PaymentRegular;

import java.math.BigDecimal;
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * the class Launch create three thread and take off the money from bill use three different ways;
 * Throw InterruptedException
 *
 * @author Ivan Zbitnev
 * @version 1.0
 */
public class Launch {
    Bill bill = new Bill(100);
    Lock lock = new ReentrantLock();

    public void getPay(PaymentInterface paymentInterface, BigDecimal quantityDeduct) {
        lock.lock();
        try {
            Pay pay = new Pay();
            BigDecimal result = pay.getPayment(paymentInterface, bill.getBill(), quantityDeduct);
            if (result.equals(BigDecimal.valueOf(-1))) {
                System.out.println("Your balance: " + bill.getBill() + "$ it's less than you try get: " +
                        quantityDeduct + "$, access denied. \nBalance: " + bill.getBill() + "$");
            } else {
                bill.setBill(result);
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    /**
     * first thread use PaymentCash strategy;
     * second thread use PaymentCashless strategy;
     * third thread use PaymentRegular strategy;
     */
    public void launch() {
        new Thread(() -> {
            BigDecimal quantityDeduct = BigDecimal.valueOf(40);
            getPay(new PaymentCash(), quantityDeduct);
        }).start();

        new Thread(() -> {
            try {
                Thread.sleep(new Random().nextInt(200));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            BigDecimal quantityDeduct = BigDecimal.valueOf(45);
            getPay(new PaymentCashless(), quantityDeduct);
        }).start();

        new Thread(() -> {
            BigDecimal quantityDeduct = BigDecimal.valueOf(35);
            getPay(new PaymentRegular(), quantityDeduct);
        }).start();
    }
}
