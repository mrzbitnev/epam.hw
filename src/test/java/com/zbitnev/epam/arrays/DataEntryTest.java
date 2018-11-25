package com.zbitnev.epam.arrays;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;

public class DataEntryTest {
    private String templateNumber = "123";
    private String templateLetter = "1qe";

    @Test
    public void testGetNumber() {
        DataEntry dataEntry = new DataEntry();
        testSetUpStreams(templateNumber);
        Assert.assertEquals(templateNumber, dataEntry.getNumber());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetNumberAndLetter() {
        DataEntry dataEntry = new DataEntry();
        testSetUpStreams(templateLetter);
        String expectErr = "String is too short or too large or have letters, please try gain";
        //Method assert there is redundant, don't be scared
        Assert.assertEquals(expectErr, dataEntry.getNumber());
    }

    public void testSetUpStreams(String string) {
        ByteArrayInputStream in = new ByteArrayInputStream(string.getBytes());
        System.setIn(in);
    }

    @After
    public void testCleanUpStreams() {
        System.setIn(System.in);
    }
}