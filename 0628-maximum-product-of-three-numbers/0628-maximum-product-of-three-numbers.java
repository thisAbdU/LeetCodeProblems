class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int option1 = nums[nums.length -1] * nums[nums.length - 2] * nums[nums.length - 3];
        int option2 = nums[nums.length -1] * nums[1] * nums[0];
        return Math.max(option1, option2);
    }
}