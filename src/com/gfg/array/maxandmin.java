package com.gfg.array;

public class maxandmin {


    public static void main(String[] args) {
        
        int[] arr=new int[]{8,1,4,7,2,0,3};
        
        int min_value = arr[0],max=0;
        for (int i=1;i< arr.length;i++){
            
            if(arr[i] > min_value){
                min_value=arr[i];
            }
        }
        System.out.println(min_value);
        
        
    }
}

