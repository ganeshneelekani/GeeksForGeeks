package hackerrank.array;

public class ArrayLeftRotation {

    public static void main(String[] args) {

        int[] arr=new int[]{1,2,3,4,5};
        int[] result = rotLeft(arr, 4);

        for (int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }


    }

    private static int[] rotLeft(int[] arr, int d) {

        int n=arr.length;
        int leftRotatedArray[]=new int[n];
        for (int i = 0; i < arr.length; i++) {

            int newIndex=(i+ n- d)%n;

            leftRotatedArray[newIndex]=arr[i];
        }

        return leftRotatedArray;
    }
}
