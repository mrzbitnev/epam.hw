package com.zbitnev.epam.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * The WordLoader class get main parametr to work
 *
 * @autor Ivan Zbitnev
 * @version 1.0
 */

class WordLoader {
    String getWords() {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String word = bufferedReader.readLine();
            if (word == null || word.equals("")) {
                System.out.println("String is empty, please type some letters");
                getWords();
            }
            return word;
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Somphing wrong is occurred, pleas try again");
            getWords();
        }
        throw new IllegalArgumentException();
    }
}
