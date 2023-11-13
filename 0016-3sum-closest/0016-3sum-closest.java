class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2];
        
        for(int i = 0; i < nums.length; i++){
            int low = i + 1;
            int high = nums.length - 1;
            
            while(low < high){
                int threeSum = nums[i] + nums[low] + nums[high];
                
                if(Math.abs(threeSum - target) < Math.abs(closestSum - target)){
                    closestSum = threeSum;
                }
                
                if(threeSum > target){
                    high--;
                }
                else{
                    low++;
                }
            }
        }
        return closestSum;
    }
}