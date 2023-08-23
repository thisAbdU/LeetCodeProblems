class Solution {
    public int maximumWealth(int[][] accounts) {  
        int maxWealth = Integer.MIN_VALUE;  
        
        for (int[] arr : accounts) {
            int sum = Arrays.stream(arr).sum();
            maxWealth = Math.max(maxWealth, sum);
        }
        
        return maxWealth; 
    }
}