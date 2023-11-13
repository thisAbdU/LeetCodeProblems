import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> brackets = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '[' || ch == '{' || ch == '(') {
                brackets.push(ch);
            } else {
                if (brackets.isEmpty()) {
                    return false; // No opening bracket for the closing one
                }
                char top = brackets.pop();
                if ((ch == ']' && top != '[') || (ch == '}' && top != '{') || (ch == ')' && top != '(')) {
                    return false; // Mismatched closing and opening brackets
                }
            }
        }
        return brackets.isEmpty(); // Ensure all opening brackets are closed
    }
}
