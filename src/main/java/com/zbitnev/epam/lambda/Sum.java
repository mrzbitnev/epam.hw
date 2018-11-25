package com.zbitnev.epam.lambda;

/**
 * the class Sum is calculating lambda sum of two number, with Addble - @FunctionalInterface;
 *
 * @version 1.0
 * @autor Ivan Zbitnev
 */
public class Sum {
    int getSum(int firstOperand, int secondOperand) {
        Addble add = (x,y) -> x + y;
        return add.add(firstOperand, secondOperand);
    }
}
