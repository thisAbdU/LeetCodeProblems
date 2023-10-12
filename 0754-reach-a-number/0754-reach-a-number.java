class Solution {
       public int reachNumber(int target) {
        // Take the absolute value of the target since it's symmetric.
        target = Math.abs(target);
        
        int n = 0;
        int sum = 0;
        
        // Increment n while the sum is less than target.
        while (sum < target || (sum - target) % 2 != 0) {
            n++;
            sum += n;
        }
        
        return n;  
    }
}