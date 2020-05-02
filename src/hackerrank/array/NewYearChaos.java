package hackerrank.array;

import java.util.Vector;

public class NewYearChaos {

    public static void main(String[] args) {
        int[] q = new int[]{2, 1, 5, 3, 4};

        int bribe=minimumBribes(q);
        System.out.println(bribe);
    }

    private static int minimumBribes(int[] a) {

        int swapCount=0;
        for (int i = a.length - 1; i > 0; i--) {


            if (a[i] != i + 1) {


                if ((i-1)>0 && a[i - 1] != i + 1) {
                    swapCount++;
                   swap(a,i,i-1);
                }
                else if ((i-2)>0 && a[i - 2] != i + 1) {
                    swapCount=swapCount+2;
                    swap(a,i-2,i-1);
                    swap(a,i-1,i);
                }
                else{
                    System.out.println("Too chaotic");

                }
            }
        }
        return swapCount;
    }

    private static void swap(int[] a, int i, int j) {

        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;

        Vector vector=new Vector();
        vector.iterator();
    }

}