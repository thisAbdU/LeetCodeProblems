class Solution {
    public int arrangeCoins(int n) {
        int row = 1;
        int count = 0;
        while (n > 0) {
            ++row;
            n -= row;
            count++;
        }return count; 
    }
}