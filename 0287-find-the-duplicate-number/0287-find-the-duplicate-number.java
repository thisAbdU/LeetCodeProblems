class Solution {
    public int findDuplicate(int[] nums) {
      int[] numsSet = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int correct = nums[i] - 1;

            if(numsSet[correct] >= 0){
                 numsSet[correct] = - Math.abs(nums[i]);
            }
            else{
                return -numsSet[correct];
            }
        }return 1;  
    }
}