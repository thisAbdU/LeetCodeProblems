class Solution {
    public int[] searchRange(int[] nums, int target) {
       int left = 0;
       int right = nums.length - 1;

       int[] result = new int[2];
        result[0] = -1;
        result[1] = -1;

       while (left <= right) {
        int mid = left + (right - left)/2;

        if (nums[mid] == target) {
            result[0] = mid;
            result[1] = mid;

            int leftPointer = mid - 1;
            int rightPointer = mid + 1;

            while (leftPointer >= 0 && nums[leftPointer] == target) {
                result[0] = leftPointer;
                leftPointer--;
            }
            while (rightPointer < nums.length && nums[rightPointer] == target) {
                result[1] = rightPointer;
                rightPointer++;
            }

            return result;

        } else if(nums[mid] < target) {
            left = mid + 1;

        }else{
            right = mid - 1;

        }

       }
       return result;
    }
}
