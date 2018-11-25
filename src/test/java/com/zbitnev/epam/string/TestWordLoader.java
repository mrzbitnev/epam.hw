package com.zbitnev.epam.string;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;

public class TestWordLoader {
    private String template = "My string";

    @After
    public void cleanUpStreams() {
        System.setIn(System.in);
    }

    @Test
    public void testGetWords() {
        WordLoader wordLoader = new WordLoader();

        setUpStreams(template);
        Assert.assertEquals(template, wordLoader.getWords());

    }

    void setUpStreams(String string) {
        ByteArrayInputStream in = new ByteArrayInputStream(string.getBytes());
        System.setIn(in);
    }
}