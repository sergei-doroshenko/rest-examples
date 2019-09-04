package org.sergei;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

@Test
public class HashMapTest {

    private Map<String, String> map;

    @BeforeMethod
    public void setUp() {
        map = new HashMap<>();
    }

    @DataProvider
    public Object[][] data() {
        return new String[][]{
                {"Adam", "Minsk"},
                {"", "Empty"},
                {null, "NullValue"},
        };
    }

    @Test(dataProvider = "data")
    public void objectStoredWithPutMethodCanRetrievedWithGet(String key, String value) {
        map.put(key, value);
        assertEquals(map.get(key), value);
    }

    public void addingSecondObjectWithTheSameKeyResultsInTheOldValueBeingReplaced() {
        String key = "Adam";
        String val01 = "Minsk", val02 = "New York";
        map.put(key, val01);
        map.put(key, val02);
        assertEquals(map.get(key), val02);
    }

    public void clearMethodRemovesAllContent() {
        String key01 = "Adam", val01 = "Minsk";
        String key02 = "Jayne", val02 = "Colorado";

        map.put(key01, val01);
        map.put(key02, val02);
        map.clear();
        assertTrue(map.size() == 0);
        assertTrue(map.isEmpty());
        assertEquals(map.get(key01), null);
        assertEquals(map.get(key02), null);
    }
}
