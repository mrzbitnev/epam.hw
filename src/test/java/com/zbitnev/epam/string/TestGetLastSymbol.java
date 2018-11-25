package com.zbitnev.epam.string;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestGetLastSymbol {
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
    public void testGetLastSymbol() {
        Parser parser = new Parser();
        parser.getLastSymbol("concatenation");
        String templateGetLastSymbol = "The last symbol is: n\n";
        Assert.assertEquals(templateGetLastSymbol, output.toString());
    }
}