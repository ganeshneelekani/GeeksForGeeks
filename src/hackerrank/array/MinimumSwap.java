package hackerrank.array;

public class MinimumSwap {

    public static void main(String[] args) {
        int[] arr=new int[]{1 ,3, 5, 2 ,4 ,6, 7};

        int res = minimumSwaps(arr);
        System.out.println(res);
    }

    static int minimumSwaps(int[] array) {
        int n = array.length - 1;
        int minSwaps = 0;
        for (int i = 0; i < n; i++) {
            int j=array[i]-1;
            if (i < j) {
                swap(array, i, Math.min(n, j));
                minSwaps++;
                i--;
            }
        }
        return minSwaps;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }
}
