package com.zbitnev.epam.trafficlight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number {
    public int getNumber() {
        String regex = "[0-9]+";
        String param;
        int number = 0;
        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            param = bf.readLine();

            if (param == null) {
                System.out.println("You entered nothing, pleas try again ");
                getNumber();
            } else if (param.equals("quit")) {
                System.out.println("Goodbye");
                bf.close();
                System.exit(0);
            } else if (param.isEmpty()) {
                System.out.println("You entered nothing, pleas try again ");
                getNumber();
            } else if (param.matches(regex)) {

                try {
                    number = Integer.parseInt(param);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                    System.out.println("An unknown error occurred, please try again");
                    getNumber();
                }
                return number % 10;
            } else {
                System.out.println("An unknown error occurred, please try again");
                getNumber();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return -1;
    }
}