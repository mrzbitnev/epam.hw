package com.zbitnev.epam.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * The DataEntry class get some number from System.in. Check NULL & empty String,
 * Can throw IllegalArgumentException or IOException;
 *
 * @version 1.0
 * @autor Ivan Zbitnev
 */
public class DataEntry {
    public String getNumber() {
        String regex = "[0-9]+";
        String number = "";

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            number = bufferedReader.readLine();
            if (number == null || number.equals("")) {
                System.out.println("String is empty, please type some letters");
            } else if (number.length() == 3 & number.matches(regex)) {
                return number;
            } else {
                System.out.println("String is too short or too large, please try gain");
            }
        } catch (IOException e) {
            System.err.println("Somphing wrong is occurred with, pleas try again" + e);
        }
        throw new IllegalArgumentException("Some problem with " + number);
    }
}

