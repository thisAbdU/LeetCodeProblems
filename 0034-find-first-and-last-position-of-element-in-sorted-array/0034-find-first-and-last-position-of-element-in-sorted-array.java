class Solution {
    public int[] searchRange(int[] nums, int target) {
       int left = 0;
        int right = nums.length - 1;
        int[] result = new int[2];
        
        // Initialize result to -1, indicating no target found initially
        result[0] = -1;
        result[1] = -1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (nums[middle] == target) {
                // Found the target, update the result
                result[0] = middle;
                result[1] = middle;

                // Expand the search to the left and right for the first and last positions
                int leftPointer = middle - 1;
                int rightPointer = middle + 1;

                while (leftPointer >= 0 && nums[leftPointer] == target) {
                    result[0] = leftPointer;
                    leftPointer--;
                }

                while (rightPointer < nums.length && nums[rightPointer] == target) {
                    result[1] = rightPointer;
                    rightPointer++;
                }

                return result;
            } else if (nums[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return result; 
    }
}