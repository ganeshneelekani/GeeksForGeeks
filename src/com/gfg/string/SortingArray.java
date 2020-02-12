package com.gfg.string;

import java.util.Arrays;
import java.util.Comparator;

public class SortingArray {
    public static void main(String[] args) {

        String s1="degfGGfgytr";

        Character[] chars=new Character[s1.length()];
        for (int i = 0; i < chars.length; i++) {
            chars[i]=s1.charAt(i);
        }

        Arrays.sort(chars);

        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }



        Arrays.sort(chars, new Comparator<Character>(){

            @Override
            public int compare(Character c1, Character c2)
            {
                // ignoring case
                return Character.compare(Character.toLowerCase(c1),
                        Character.toLowerCase(c2));
            }
        });

        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

    }
}
