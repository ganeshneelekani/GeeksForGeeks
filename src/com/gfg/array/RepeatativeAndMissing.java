package com.gfg.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RepeatativeAndMissing {

    static void printTwoElements(int arr[], int size)
    {
        int i;
        System.out.print("The repeating element is ");

        for (i = 0; i < size; i++) {
            int abs_val = Math.abs(arr[i]);
            if (arr[abs_val - 1] > 0)
                arr[abs_val - 1] = -arr[abs_val - 1];
            else
                System.out.println(abs_val);
        }

        System.out.print("And the missing element is ");
        for (i = 0; i < size; i++) {
            if (arr[i] > 0)
                System.out.println(i + 1);
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        int arr[] = { 7, 3, 4, 5, 6, 5, 6 };
        int n = arr.length;

        Arrays.sort(arr);

        Set set=new HashSet();
        set.add(1);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);




        printTwoElements(arr, n);
    }
}
