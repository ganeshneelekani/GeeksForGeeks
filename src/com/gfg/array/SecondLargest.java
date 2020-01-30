package com.gfg.array;


/*Second Largest */
public class SecondLargest {

    public static void main(String[] args) {

        int[] arr=new int[]{14, 46, 47, 86, 92, 52, 48, 36, 66, 85 };

        int largest = arr[0];
        int secondlargest=arr[0];
        for (int i=0;i< arr.length;i++){

            if(arr[i] > largest)
            {
                secondlargest=largest;
                largest=arr[i];
            }
            else if(arr[i]> secondlargest)
            {
                secondlargest=arr[i];
            }

        }
        System.out.println(secondlargest);

    }
}
