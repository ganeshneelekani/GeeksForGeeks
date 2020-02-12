package com.gfg.string;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String[] s1=new String[]{"a","b","c","d"};
        String[] s2=new String[]{"d","c","b","a"};

        Arrays.sort(s1);
        Arrays.sort(s2);

         boolean myVlaue=checkAnagram(s1,s2);

         if(myVlaue==Boolean.TRUE){
             System.out.println("     Anagram    ");
         }
         else{
             System.out.println("     Not an Anagram    ");
         }

    }

    private static boolean checkAnagram(String[] s1, String[] s2) {


        for (int i = 0; i < s1.length ; i++)
            if(!s1[i].equals(s2[i])){
                return  false;
            }

        return true;
    }


}
