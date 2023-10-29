class Solution {
    public boolean judgeSquareSum(int c) {
        int i = 0;
        int j = (int) Math.sqrt(c); // Initialize j to the square root of c
        
        while (i <= j) {
            long sumOfSquare = (long)i * i + (long)j * j; // Use long to avoid overflow
            if (sumOfSquare > c) {
                j--;
            } else if (sumOfSquare < c) {
                i++;
            } else {
                return true; // Check if i and j are non-negative
            }
        }
        
        return false;
    }
}
