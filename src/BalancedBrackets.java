import java.util.*;

class BalancedBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[')
                st.push(c);
            else {
                if (st.isEmpty()) {
                    System.out.println("NO");
                    return;
                }
                char top = st.pop();
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println(st.isEmpty() ? "YES" : "NO");
    }
}