package com.zbitnev.epam.string;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestGetSymbol {
    private ByteArrayOutputStream output;
    private PrintStream old;

    @Before
    public void setUpStreams() {
        old = System.out;
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(old);
    }

    @Test
    public void testGetSymbol() {
        Parser parser = new Parser();
        parser.getSymbol("c");
        parser.getSymbol("concatenation");
        parser.getSymbol("con9");
        parser.getSymbol("concatenation5");

        String templateMinValue = "The word is too small, we can't give K-th symbol\n";
        String templateLooseNumber = "if you want some symbol - you have to print number of it the last one\n";
        String templateCountLetterMistace = "Your number is too big for this word, try again\n";
        String templateGetCountLetter = "Symbol number 5 if a\n";
        Assert.assertEquals(
                 templateMinValue
                        + templateLooseNumber
                        + templateCountLetterMistace
                        + templateGetCountLetter
                        , output.toString());
    }
}