import java.util.*;

class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        int[] count1 = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count1[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            count1[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (count1[i] != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            String t = sc.nextLine();
            System.out.println(isAnagram(s, t));
        }
    }
}
