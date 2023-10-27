class Solution {

    public int evalRPN(String[] tokens) {
        Stack<Integer> value = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("-")|| tokens[i].equals("*") || tokens[i].equals("+") || tokens[i].equals("/")) {
                int num1 = value.pop();
                int num2 = value.pop();
               
            value.push(calculate(num2, num1, tokens[i]));
        
            } else {
                value.push(Integer.parseInt(tokens[i]));
            }
        }
        return value.peek();
    }

    static int calculate(int num1, int num2, String operator){
        if (operator .equals("+")) {
                return num1 + num2;    
            }
         if (operator.equals("-")) {
                return num1 - num2;    
            }
         if (operator.equals("*")) {
                return (int) num1*num2;    
            }
         if (operator.equals("/")) {
                return num1/num2;    
            }

            return 0;
    }
}