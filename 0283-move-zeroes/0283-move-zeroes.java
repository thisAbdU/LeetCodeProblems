class Solution {
    public void moveZeroes(int[] nums) {
            int i = 0;
            int j = 0;
            while (j < nums.length) {
                if (nums[j] != 0) {
                    swap(i, j, nums);
                    i++;
                }
                j++;
            }
        }

    private static void swap(int index1, int index2, int[] nums){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}