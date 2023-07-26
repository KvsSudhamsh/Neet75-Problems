package SlidingWindow;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MinimumWindowSubstring {

    public static String minWindow(String s, String t) {
        if (s == null || t == null || s.length() == 0 || t.length() == 0 || s.length() < t.length()) {
            return "";
        }
        Map<Character, Integer> targetMap = new HashMap<>();
        Map<Character, Integer> windowMap = new HashMap<>();
        for (char c : t.toCharArray()) {
            targetMap.put(c, targetMap.getOrDefault(c, 0) + 1);
        }

        int left = 0;
        int right = 0;
        int minWindowLength = Integer.MAX_VALUE;
        int minWindowStart = 0;

        int requiredChars = targetMap.size();
        int formedChars = 0;

        while (right < s.length()) {
            char rightChar = s.charAt(right);
            windowMap.put(rightChar, windowMap.getOrDefault(rightChar, 0) + 1);

            if (targetMap.containsKey(rightChar) && windowMap.get(rightChar).equals(targetMap.get(rightChar))) {
                formedChars++;
            }

            while (left <= right && formedChars == requiredChars) {
                char leftChar = s.charAt(left);

                if (right - left + 1 < minWindowLength) {
                    minWindowLength = right - left + 1;
                    minWindowStart = left;
                }

                windowMap.put(leftChar, windowMap.get(leftChar) - 1);

                if (targetMap.containsKey(leftChar) && windowMap.get(leftChar) < targetMap.get(leftChar)) {
                    formedChars--;
                }

                left++;
            }

            right++;
        }

        return minWindowLength == Integer.MAX_VALUE ? ""
                : s.substring(minWindowStart, minWindowStart + minWindowLength);
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            String t = sc.nextLine();
            String res = minWindow(s, t);
            System.out.println("min Window Substring :" + res);
        }
    }
}
