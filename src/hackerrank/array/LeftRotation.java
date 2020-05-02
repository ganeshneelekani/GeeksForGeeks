package hackerrank.array;

public class LeftRotation {

    public static void main(String[] args) {

        int[] a=new int[]{4,3,6,7};
        int res[] = rotLeft(a, 3);
    }

    private static int[] rotLeft(int[] a, int d) {
        int n = a.length;
        int[] rotArray = new int[n];

        for (int oldIndex = 0; oldIndex < n; oldIndex++) {
            int newIndex = (oldIndex + n - d) % n;
            rotArray[newIndex] = a[oldIndex];
        }

        return rotArray;
    }
}
