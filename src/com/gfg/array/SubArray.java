package com.gfg.array;


class SubArray {
    /* Returns true if the there is a subarray of arr[] with sum equal to
       'sum' otherwise returns false.  Also, prints the result */
    int subArraySum(int arr[], int n, int sum)
    {
        int max_so_far = arr[0];
        int max_end_here=0;
        int start = 0, end=0, s=0;

        for (int i=0;i<n;i++){

            max_end_here = max_end_here + arr[i];

            if(max_so_far < max_end_here){

                max_so_far = max_end_here;
                start = s;
                end = i;
            }

            if(max_end_here < 0){
                max_end_here = 0;
                s=i+1;
            }
        }

        System.out.println(start +"  "+end);

        return max_so_far;
    }

    public static void main(String[] args)
    {
        SubArray arraysum = new SubArray();
        int arr[] = {-3,-2 ,0,-2,-3};
        int n = arr.length;
        int sum = 0;
        arraysum.subArraySum(arr, n, sum);
    }
}
