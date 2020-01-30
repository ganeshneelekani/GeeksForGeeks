package com.gfg.array;

import java.util.Arrays;

public class removedupliactes {

    public static void main(String[] args) throws CloneNotSupportedException
    {
        // Array with duplicate elements
        Integer[] origArray = new Integer[] { 1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8 };

        // This array has duplicate elements
        System.out.println(Arrays.toString(origArray));

        Integer[] tempArray = removeDuplicates(origArray);

        // Verify the array content
        System.out.println(Arrays.toString(tempArray));
    }

    private static Integer[] removeDuplicates(Integer[] origArray) {

        Integer[] tempArray = new Integer[origArray.length];

        int indexJ = 0;
        for (int indexI = 0; indexI < origArray.length - 1; indexI++)
        {
            Integer currentElement = origArray[indexI];

            if (currentElement != origArray[indexI+1]) {
                origArray[indexJ++] = currentElement;
            }
        }

        origArray[indexJ++] = origArray[origArray.length-1];

        return origArray;
    }
}
