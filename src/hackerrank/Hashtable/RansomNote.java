package hackerrank.Hashtable;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public static void main(String[] args) {

        String s1="two times three is not four";
        String s2="two times two is four";

        String[] magazine=s1.split(" ");
        String[] note=s2.split(" ");

        boolean value=checkMagazine(magazine, note);
        System.out.println(value);
    }

    private static boolean checkMagazine(String[] magazine, String[] ransom) {

        Map<String, Integer> magazineOccurences = new HashMap<>();
        Map<String, Integer> ransomOccurences = new HashMap<String, Integer>();

        for (String word : magazine) {
            if (!magazineOccurences.containsKey(word)) magazineOccurences.put(word, 0);
            magazineOccurences.put(word, magazineOccurences.get(word) + 1);
        }

        for (String word : ransom) {
            if (!ransomOccurences.containsKey(word)) ransomOccurences.put(word, 0);
            ransomOccurences.put(word, ransomOccurences.get(word) + 1);
        }

        for (String key : ransomOccurences.keySet()) {
            if (!magazineOccurences.containsKey(key)) return false;
            int needed = ransomOccurences.get(key);
            System.out.println(needed);
            if (magazineOccurences.get(key) < needed) return false;
        }

        return true;
    }
}