package SlidingWindow;

import java.util.Scanner;

public class LongestRepeatingCharacterReplacement {
    public static int characterReplacement(String s, int k) {
        int n = s.length();
        int start = 0;
        int count = 0;
        int res = 0;
        int[] c = new int[26];

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            c[ch - 'A']++;
            count = Math.max(count, c[ch - 'A']);

            while (i - start + 1 - count > k) {
                c[s.charAt(start) - 'A']--;
                start++;
            }
            res = Math.max(res, i - start + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            int k = sc.nextInt();
            int MaxCount = characterReplacement(s, k);
            System.out.println("Longest Repeating character Replacement count :" + MaxCount);
        }
    }
}
