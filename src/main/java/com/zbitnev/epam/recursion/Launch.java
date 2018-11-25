package com.zbitnev.epam.recursion;

import com.zbitnev.epam.recursion.exercise.Exponentiation;
import com.zbitnev.epam.recursion.exercise.Factorial;
import com.zbitnev.epam.recursion.exercise.NaturalNumber;

public class Launch {
    public void startLaunch() {
        Factorial factorial = new Factorial();
        System.out.println(factorial.getFactorial(5));

        Exponentiation exponentiation = new Exponentiation();
        System.out.println(exponentiation.getExponentiation(10, 2));

        NaturalNumber naturalNumber = new NaturalNumber();
        System.out.println(naturalNumber.getSum(5));
        System.out.println(naturalNumber.getMultiplication(5));
    }
}
