package hackerrank.Hashtable;

import java.util.HashMap;
import java.util.Map;

public class TwoString {

    public static void main(String[] args) {

        String s1="hello";
        String s2="world";

        String value=twoStrings(s1,s2);
        System.out.println(value);

    }

    static String twoStrings(String s1, String s2) {

        String value=new String();
        Map<Character, Integer> hashMapS1 = new HashMap();
        Map<Character, Integer> hashMapS2 = new HashMap();

        char[] splitStrings1 = s1.toCharArray();
        char[] splitStrings2 = s2.toCharArray();

        for (int i = 0; i < splitStrings1.length; i++) {
            if (!hashMapS1.containsKey(splitStrings1[i]))
                hashMapS1.put(splitStrings1[i], 0);
            else
                hashMapS1.put(splitStrings1[i], hashMapS1.get(splitStrings1[i]) + 1);
        }

        for (int i = 0; i < splitStrings2.length; i++) {

           if(hashMapS1.containsKey(splitStrings2[i])){

               value="Yes";
                break;
           }
           else{
               value="No";
           }
        }
        return value;
    }
}
