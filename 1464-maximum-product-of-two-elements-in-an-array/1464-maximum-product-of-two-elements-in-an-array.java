class Solution {
    public int maxProduct(int[] nums) {
        int firstMaxi = Integer.MIN_VALUE;
        int secondMaxi = firstMaxi;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > firstMaxi){
                secondMaxi = firstMaxi;
                firstMaxi = nums[i];
            }else if(nums[i] > secondMaxi){
                secondMaxi = nums[i];
            }
        }
        return (firstMaxi - 1)*(secondMaxi - 1);
    }
}