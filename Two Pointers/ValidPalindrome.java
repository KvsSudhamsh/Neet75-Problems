import java.util.*;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        String s1 = s.replaceAll("[^A-Za-z0-9]+", "").toLowerCase();
        int i = 0;
        int len = s1.length() - 1;
        // System.out.println(s1);
        while (i <= len) {
            if (s1.charAt(i) != s1.charAt(len)) {
                return false;
            }
            i++;
            len--;
        }
        return true;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            boolean res = isPalindrome(s);
            System.out.println(res);
        }
    }
}
