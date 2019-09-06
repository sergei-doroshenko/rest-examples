package org.sergei.model;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

@Test
public class MoneyTest {

    @DataProvider
    private static final Object[][] getMoney(){
        return new Object[][] {
                {10, "USD"},
                {20, "EUR"}
        };
    }

    @Test(dataProvider = "getMoney", dataProviderClass = DataProviders.class)
    public void constructorShouldSetAmountAndCurrency(int amount, String currency) {
        Money money = new Money(amount, currency);
        assertEquals(money.getAmount(), amount);
        assertEquals(money.getCurrency(), currency);
    }
}
