package org.sergei;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@Test
public class FahrenheitCelsiusConverterTest {

    @DataProvider
    public Object[][] celsiusToFahrenheit() {
        return new Integer[][] {
                {0, 32},
                {37, 98},
                {100, 212}
        };
    }

    @Test(dataProvider = "celsiusToFahrenheit")
    public void shouldConvertCelsiusToFahrenheit(int caesium, int fahrenheit) {
        assertEquals(FahrenheitCelsiusConverter.toFahrenheit(caesium), fahrenheit);
    }

    @DataProvider
    public Object[][] fahrenheitToCelsius() {
        return new Integer[][] {
                {32, 0},
                {100, 37},
                {212, 100}
        };
    }

    @Test(dataProvider = "fahrenheitToCelsius")
    public void shouldConvertFahrenheitToCelsius(int fahrenheit, int caesium) {
        assertEquals(FahrenheitCelsiusConverter.toCelsius(fahrenheit), caesium);
    }
}
