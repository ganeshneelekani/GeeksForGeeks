package hackerrank.warmup;

public class countValleys {

    public static void main(String[] args) {

        String s="UDDDUDUU";
        int n=s.length();
        int result = countingValleys(n, s);
        System.out.println(result);

    }

    private static int countingValleys(int n, String s) {

        char[] chars=s.toCharArray();
        int result=0;
        int k=0;
        for (int i=0;i<chars.length;i++){
            System.out.println(chars[i]);

            if(chars[i]=='U'){

                k++;
                if(k==0){
                    result++;
                }

            }
            else{

                k--;
            }
        }
        return result;
    }
}
