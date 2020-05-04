package com.gfg.array;

public class ReverseAnArray {

    public static void main(String[] args) {

        int[] arrayElement=new int[]{11,22,33,44,55};

        System.out.println(" Array element without a rotation.");
        for (int i = 0; i < arrayElement.length; i++) {
            System.out.print(arrayElement[i]+"\t");
        }

        int numberOfItertion=arrayElement.length/2;
        for (int i = 0; i < arrayElement.length  && i < numberOfItertion; i++) {

            int temp=arrayElement[i];
            arrayElement[i]=arrayElement[arrayElement.length-i-1];
            arrayElement[arrayElement.length-i-1] = temp;

        }

        System.out.println(" Array element without after rotation.");
        for (int i = 0; i < arrayElement.length; i++) {
            System.out.print(arrayElement[i]+"\t");
        }

    }
}
