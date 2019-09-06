package org.sergei.model;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class StringTest {

    @DataProvider
    public static final Object[][] getValidCases() {
        return new String[][] {
                {"a", "a"},
                {"ab ", " ba"},
                {"abcd", "dcba"}
        };
    }

    @Test(dataProvider = "getValidCases")
    public void validRevers(String input, String result) {
        assertEquals(MyUtil.reverse(input), result);
    }

    @DataProvider
    public static final Object[][] getInvalidCases() {
        return new String[][] {
                {""}, {null}
        };
    }

    @Test(dataProvider = "getInvalidCases", expectedExceptions = IllegalArgumentException.class)
    public void invalidRevers(String input) {
        MyUtil.reverse(input);
    }
}
