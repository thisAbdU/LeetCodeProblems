class Solution {
  public int[] plusOne(int[] digits) {
        
    int lastDigit = digits.length;
    for(int i=lastDigit-1; i>=0; i--) {
        if(digits[i] < 9) {
            digits[i]++;
            return digits;
        }
        
        digits[i] = 0;
    }
    
    int[] number = new int[lastDigit + 1]; // if all the digits are 9
    number[0] = 1;
    
    return number;
}
}