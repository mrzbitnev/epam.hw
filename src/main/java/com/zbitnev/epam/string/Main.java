package com.zbitnev.epam.string;
/**
 * The Main class lounch our methods
 *
 * @autor Ivan Zbitnev
 * @version 1.0
 */

public class Main {
    public static void main(String[] args) {
        WordLoader wordLoader = new WordLoader();
        Parser parser = new Parser();
        parser.launchParser(wordLoader.getWords());
    }
}
