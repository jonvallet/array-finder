package com.jonvallet.tests.arrayfinder;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jon on 14/09/15.
 */
public class ArrayFinderTest {

    @Test
    public void array2_3_4_5_and_4_5_returns_2() {
        int firstArray [] = {2,3,4,5};
        int secondArray [] = {4,5};

        int expectedValue = 2;
        int actualValue = ArrayFinder.firstPosition(firstArray, secondArray);
        Assert.assertEquals(expectedValue, actualValue);
    }
}
