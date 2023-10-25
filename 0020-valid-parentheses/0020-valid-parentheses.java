import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
      Stack<Character> chars = new Stack<>();
        
      for(Character ch: s.toCharArray()){
          if(ch == '[' || ch.equals('{') || ch.equals('(')){
              chars.push(ch);
          }
          else{
              if(ch.equals('}')){
                   if(chars.isEmpty() || chars.pop() != '{'){
                       return false;
                   }
              }if(ch.equals(')')){
                   if(chars.isEmpty() || chars.pop() != '('){
                       return false;
                   }
              }if(ch.equals(']')){
                   if(chars.isEmpty() || chars.pop() != '['){
                       return false;
                   }
              }
    
      }
    } return chars.isEmpty();
}
    
}