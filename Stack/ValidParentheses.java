package Stack;

import java.util.Stack;
import java.util.Scanner;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for (char a : s.toCharArray()) {
            if (a == '(' || a == '[' || a == '{') {
                st.push(a);
            } else {
                if (st.isEmpty()) {
                    return false;
                }
                char top = st.peek();
                if ((a == ')' && top == '(') || (a == ']' && top == '[') || (a == '}' && top == '{')) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            boolean result = isValid(s);
            System.out.println("Is the String has valid Parentheses :" + result);
        }
    }

}
