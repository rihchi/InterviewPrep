package com.company.Sequences;

import java.util.HashMap;

public class ValidAnagram {

    public static boolean integerArraySolution(String s, String t) {
        if(s.length() != t.length())
            return false;

        int[] char_counts = new int[26];
        for (int i=0; i<s.length(); i++) {
            char_counts[s.charAt(i) - 'a']++;
            char_counts[t.charAt(i) - 'a']--;
        }

        for (int count: char_counts) {
            if (count != 0)
                return false;
        }

        return true;
    }

    public static boolean hashSolution(String s, String t) {
        if (s.length() != t.length())
            return false;

        HashMap<Character, Integer> charHash = new HashMap<>();
        readStringIntoHash(charHash, s, true);
        readStringIntoHash(charHash, t, false);

        for (Integer val: charHash.values()) {
            if (val != 0)
                return false;
        }

        return true;
    }

    private static void readStringIntoHash(HashMap<Character, Integer> charHash, String word, boolean isIncrement) {
        for (Character c: word.toCharArray()) {
            if (charHash.containsKey(c)) {
                if (isIncrement)
                    charHash.put(c, charHash.get(c) + 1);
                else
                    charHash.put(c, charHash.get(c) - 1);
            }
            else {
                charHash.put(c, 1);
            }
        }
    }
}
