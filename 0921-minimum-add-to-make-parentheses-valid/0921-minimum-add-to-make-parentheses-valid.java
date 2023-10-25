import java.util.Stack;

class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> parnthesis = new Stack<>();

     for (Character ch : s.toCharArray()) {
        if (ch == ')') {
            if (!parnthesis.isEmpty() && parnthesis.peek() == '(') {
                parnthesis.pop();
            }else{
                parnthesis.push(ch);
            }
        }
        else{
            parnthesis.push(ch);
        }
     }return parnthesis.size();
    }
}