package com.zbitnev.epam.string;

/**
 * Class Parser get some string and use it
 *
 * @version 1.0
 * @autor Ivan Zbitnev
 */

public class Parser {
    void launchParser(String word) {
        getThirdSymbol(word);
        getLastSymbol(word);
        getSymbol(word);
        getCountSameLetters(word);
        getChangeWord(word);
    }
    void getThirdSymbol(String word) {
        if (word.length() >= 3) {
            System.out.println("The third symbol is: " + word.charAt(2));
        } else if (word.length() < 3) {
            System.out.println("The word is too small, we can't give third symbol");
        }
    }
    void getSymbol(String word) {
        if (word.length() > 1) {
            char lastOne = word.charAt(word.length() - 1);

            if (Character.isDigit(lastOne)) {
                int number = Integer.parseInt(String.valueOf(lastOne));
                if (number < word.length()) {
                    System.out.println("Symbol number " + number + " if " + word.charAt(number - 1));
                } else {
                    System.out.println("Your number is too big for this word, try again");
                }
            } else {
                System.out.println("if you want some symbol - you have to print number of it the last one");
            }
        } else if (word.length() <= 1) {
            System.out.println("The word is too small, we can't give K-th symbol");
        }
    }
    void getLastSymbol(String word) {
        if (word.length() < 2) {
            System.out.println("The last symbol is: " + word);
        } else {
            System.out.println("The last symbol is: " + word.charAt(word.length() - 1));
        }
    }
    void getCountSameLetters(String words) {
        int index = 0;

        for (int i = 0; i < words.length() - 1; i++) {
            char firstSameChar = words.charAt(i);
            char secondSameChar = words.charAt(++i);
            i--;
            if (firstSameChar == secondSameChar) {
                index++;
            }
        }
        System.out.println("The identical symbol is/are: " + index);
    }
    void getChangeWord(String word) {
        if (word.length() >= 5) {
            char[] letters = new char[word.length()];

            word.getChars(0, letters.length, letters, 0);
            char tmp = letters[1];
            letters[1] = letters[4];
            letters[4] = tmp;

            System.out.println("Method change symbols changed " + word + " to " + String.valueOf(letters));
        } else {
            System.out.println("The word is too small, method get chande symbols can't work, please try again");
        }
    }
}
