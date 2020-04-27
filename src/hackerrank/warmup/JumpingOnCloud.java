package hackerrank.warmup;

public class JumpingOnCloud {

    public static void main(String[] args) {

        int[] c = new int[]{0 ,0 ,0 ,0 ,1 ,0};

        int result = jumpingOnClouds(c);
        System.out.println(result);
    }

    private static int jumpingOnClouds(int[] c) {

        int count=0;
        for (int i=0;i< c.length;){

            if(i+2 < c.length && c[i+2]==0 ){

                    i=i+2;
            }
            else {
                i++;
            }
            count++;
        }
        return count;
    }
}
