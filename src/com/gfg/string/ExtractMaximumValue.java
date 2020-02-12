package com.gfg.string;

public class ExtractMaximumValue {

    static int extractMaximum(String str) {
        int num = 0, res = 0;

        // Start traversing the given string
        for (int i = 0; i < str.length(); i++) {
            // If a numeric value comes, start converting
            // it into an integer till there are consecutive
            // numeric digi
            if (Character.isDigit(str.charAt(i))) {
                System.out.println(str.charAt(i));
                num = num * 10 + (str.charAt(i));
            }

                // Update maximum value
            else {
                res = Math.max(res, num);

                // Reset the number
                num = 0;
            }
        }


        // Return maximum value
        return Math.max(res, num);
    }

    // Driver method
    public static void main(String[] args)
    {
        String str = "100klh564abc365bg";
        System.out.println(extractMaximum(str));
    }
}
