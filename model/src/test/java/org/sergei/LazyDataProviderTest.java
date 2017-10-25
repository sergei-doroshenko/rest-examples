package org.sergei;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Iterator;

public class LazyDataProviderTest {

    @DataProvider
    private final Iterator<Object[]> getLazyData() {
        return new Iterator<Object[]>() {
            private int counter = 1;

            @Override
            public boolean hasNext() {
                return counter < 4;
            }

            @Override
            public Object[] next() {
                return new Object[]{new ComplexObject(counter++)};
            }

            @Override
            public void remove() { // not important }
            }
        };
    }

    @Test(dataProvider = "getLazyData")
    public void testLazyData(ComplexObject object) {
        System.out.println("lazy data: " + object);
    }
}
