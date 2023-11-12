class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int i = nums.length - 1;
        int j = nums.length - 2;
        int k = nums.length - 3;
        
       while(k >= 0){
            if(nums[i] + nums[j] > nums[k] && nums[k] + nums[j] > nums[i] && nums[k] + nums[j] > nums[j]){
               return nums[i] + nums[k] + nums[j];
            }
           i--;
           j--;
           k--;
           
        } return 0;
    }
}