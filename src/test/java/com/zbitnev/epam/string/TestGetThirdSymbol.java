package com.zbitnev.epam.string;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestGetThirdSymbol {
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
    public void testGetThirdSymbol() {
        Parser parser = new Parser();
        parser.getThirdSymbol("concatenation");
        parser.getThirdSymbol("12");

        String template = "The third symbol is: n\n";
        String templateMinValue = "The word is too small, we can't give third symbol\n";
        Assert.assertEquals(template + templateMinValue, output.toString());
    }
}