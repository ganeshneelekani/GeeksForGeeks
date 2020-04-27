package hackerrank.warmup;

import java.util.HashSet;
import java.util.Set;

public class SocketMerchant {

    public static void main(String[] args) {

        int[] ar = new int[]{10,20,20,10,10,30,50,10,20};

        int n=ar.length;

        int result = sockMerchant(n, ar);
        System.out.println(result);
    }

    private static int sockMerchant(int n, int[] ar) {

        Set<Integer> integerSet=new HashSet<>();
        int count=0;

        for (int i=0;i<ar.length;i++){

            if(integerSet.contains(ar[i])){
                integerSet.remove(ar[i]);
                count++;
            }
            else {
                integerSet.add(ar[i]);
            }
        }
        return count;
    }
}
