package SlidingWindow;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        int start = 0;
        int maxLength = 0;
        Map<Character, Integer> charIndexMap = new HashMap<>();

        for (int end = 0; end < s.length(); end++) {
            if (charIndexMap.containsKey(s.charAt(end)) && charIndexMap.get(s.charAt(end)) >= start) {
                start = charIndexMap.get(s.charAt(end)) + 1;
            } else {
                int currentLength = end - start + 1;
                maxLength = Math.max(maxLength, currentLength);
            }

            charIndexMap.put(s.charAt(end), end);
        }

        return maxLength;
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            int maxlength = lengthOfLongestSubstring(s);
            System.out.println("lengthOfLongestSubstring :" + maxlength);
        }
    }
}
