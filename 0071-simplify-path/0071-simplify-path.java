import java.util.Stack;

public class Solution {
    public String simplifyPath(String path) {
        String[] patharr = path.split("/");
        Stack<String> canonical = new Stack<>();
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < patharr.length; i++) {
            if (patharr[i].equals("..") && !canonical.isEmpty()) {
                canonical.pop();
            } else if (!patharr[i].equals("") && !patharr[i].equals(".")) {
                canonical.push(patharr[i]);
            }
        }

        for (String string : canonical) {
            if(!string.equals("..")){
                output.append("/" + string);
            }
            
        }

        return output.length() > 0 ? output.toString() : "/";
    }
}