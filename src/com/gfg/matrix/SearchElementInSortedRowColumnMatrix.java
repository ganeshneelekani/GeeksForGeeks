package com.gfg.matrix;

public class SearchElementInSortedRowColumnMatrix {

    public static void main(String[] args) {
        new SearchElementInSortedRowColumnMatrix();
    }

    public SearchElementInSortedRowColumnMatrix() {
        int[][] arr = {
                {1,   2,  3, 4},
                {5,   6,  7, 8},
                {9,  10, 11, 12},
                {13, 14, 15, 16}
        };

        int toSearch=10;

        int column=arr[0].length-1;
        int row=0;
        boolean isFound=false;

        while(row<arr.length && column>=0){
            if(arr[row][column] == toSearch){
                isFound=true;
                break;

            }else if(toSearch > arr[row][column]){
                row++;

            }else{
                column--;
            }
        }
        System.out.println(isFound);
    }
}
