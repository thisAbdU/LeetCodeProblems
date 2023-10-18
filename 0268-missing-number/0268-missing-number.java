class Solution {
    public int missingNumber(int[] nums ){
        sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }return nums.length;
    }
    
    static int[] sort(int[] nums) {
       int i = 0;
       while (i < nums.length) {
        if(nums[i] != i && nums[i] < nums.length){
                swap(nums, i, nums[i]);
            }
            else{
                i++;
            }

       }
       return nums;
        
    }

    static void swap(int[] nums, int numOne, int numTwo){
        int temp = nums[numOne];
        nums[numOne] = nums[numTwo];
        nums[numTwo] = temp;
    }
}