class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int maxGap = 0; 
        
        for(int i = 1; i < nums.length; i++){
           maxGap = Math.max(maxGap, Math.abs(nums[i] - nums[i-1]));
        }
        return maxGap;
    }
}