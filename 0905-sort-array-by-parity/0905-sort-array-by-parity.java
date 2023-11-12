class Solution {
    public int[] sortArrayByParity(int[] nums) {
      int[] sortedByParity = new int[nums.length];
      int even = 0;
      int odd = sortedByParity.length - 1;
      
      for(int i = 0; i < nums.length; i++){
          if(nums[i]%2 == 0){
              sortedByParity[even] = nums[i];
              even++;
          }
          else{
              sortedByParity[odd] = nums[i];
              odd--;
          }
      }
        return sortedByParity;
    }
}