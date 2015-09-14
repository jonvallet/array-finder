package com.jonvallet.tests.arrayfinder;

/**
 * Created by jon on 14/09/15.
 */
public class ArrayFinder {

    /**
     * Will find the starting position of the second array in the
     * first array. i.e. [2,3,4,5] and [4,5] should return 2.
     * <p>
     * Index position will be 0 for first element.
     * <p>
     * -1 will be returned if no element of the second array is not found at the first array.
     *
     * @param firstArray
     * @param secondArray
     * @return
     */
    public static int firstPosition(int[] firstArray, int[] secondArray) {

        for (int i = 0; i < secondArray.length; i++) {
            for (int j = 0; j < firstArray.length; j++) {
                if (secondArray[i] == firstArray[j]) {
                    return j;
                }
            }
        }

        return -1;
    }
}