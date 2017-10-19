package org.sergei;

import org.testng.annotations.DataProvider;

public class DataProviders {

    @DataProvider
    public static final Object[][] getMoney() {
        return new Object[][]{
                {15, "USD"},
                {25, "EUR"}
        };
    }
// some more data providers declared here

}
