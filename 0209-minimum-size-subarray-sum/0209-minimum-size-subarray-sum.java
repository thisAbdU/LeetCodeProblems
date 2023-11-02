class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int currentSum = 0;
        int minSize = Integer.MAX_VALUE;
        int currentSize = 0;
        int start = 0;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            currentSize++;

            while (currentSum >= target) {
                minSize = Math.min(currentSize, minSize);
                currentSum -= nums[start];
                currentSize--;
                start++;
            }
        }

        return minSize == Integer.MAX_VALUE ? 0 : minSize;
    }
}
