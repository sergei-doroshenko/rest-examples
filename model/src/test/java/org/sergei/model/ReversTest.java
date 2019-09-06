package org.sergei.model;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ReversTest {

    @DataProvider
    public final Object[][] getValidCases() {
        return new String[][] {
                {"a", "a"},
                {"ab ", " ba"},
                {"abcd", "dcba"}
        };
    }

    @Test(dataProvider = "getValidCases")
    public void validRevers(String input, String result) {
        assertEquals(new Revers(input).get(), result);
    }

    @DataProvider
    public final Object[][] getInvalidCases() {
        return new String[][] {
                {""}, {null}
        };
    }

    @Test(dataProvider = "getInvalidCases", expectedExceptions = IllegalArgumentException.class)
    public void invalidRevers(String input) {
        new Revers(input);
    }

}
