class Solution {
    public int arrangeCoins(int n) {
        int left = 1;
        int right = n;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long gaussCheck = (long)mid * (mid + 1) / 2; 
            if (gaussCheck > n) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        if ((long)left * (left + 1) / 2 > n) {
            return left - 1;
        }
        
        return left;
    }
}