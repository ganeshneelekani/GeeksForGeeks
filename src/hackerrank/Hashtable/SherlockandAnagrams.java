package hackerrank.Hashtable;

public class SherlockandAnagrams {

    public static void main(String[] args) {

    String name="aaba"    ;
    int[] nameCharArray=new int[name.length()];

        int nameLenght = name.length();
        for(int i = 0; i < nameLenght ; i++) {
            char character = name.charAt(i);
            int ascii = (int) character;
            nameCharArray[i]=ascii;
          //  System.out.println(character + " = " + ascii);
        }

        int[] arrayValue=new int[]{3,7,5,10,2,7,4,2};

        String result = sherlockAndAnagrams(nameCharArray);
        System.out.println(result);
    }

    private static String sherlockAndAnagrams(int[] arrayValue) {

        int sum=0;
        for (int i = 0; i < arrayValue.length; i++) {
            sum=sum+arrayValue[i];

        }

        System.out.println(sum);
        int value=0;
        for (int i = 0; i < arrayValue.length; ) {

            int y=sum - arrayValue[i];
            System.out.println("y  "+y);
            System.out.println("x  "+2 * value);
            if(2 * value == sum - arrayValue[i] ){

                return "YES";
            }
            else{

                value=value+arrayValue[i];
                System.out.println(value);
                i++;
            }
        }

        return "NO";
    }
}
