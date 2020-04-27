package hackerrank.warmup;

public class RepeatedString {

    public static void main(String[] args) {

        String s="aba";
        int n=10;

        long result = repeatedString(s, n);
        System.out.println(result);
    }

    private static long repeatedString(String s, long n) {

        long moduleValue=n%s.length();
        long reminder=n/s.length();
        long numberOfOccurance=0;
        long numberOfOccuranceSubString=0;
        long total=0;

        System.out.println(moduleValue);
        System.out.println(reminder);


        char[] charArray=s.toCharArray();

        for (int i=0;i< charArray.length;i++){

           if(charArray[i]=='a'){
               numberOfOccurance++;
           }
        }

        System.out.println(numberOfOccurance +" numberOfOccurance");
        total=reminder*numberOfOccurance;
        System.out.println(total);

        String substring=s.substring(0, (int) moduleValue);
        System.out.println(substring);
        char[] charArraySubString=substring.toCharArray();

        for (int i=0;i< charArraySubString.length;i++){


            if(charArraySubString[i]=='a'){
                numberOfOccuranceSubString++;
            }
        }

        System.out.println(numberOfOccuranceSubString);
        return total+numberOfOccuranceSubString;

    }
}
