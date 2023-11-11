class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> uniqueNums = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            uniqueNums.add(nums[i]);
        }
        
        int[] uniqueArray = new int[uniqueNums.size()];
        int index = 0;
        for (int num : uniqueNums) {
            uniqueArray[index++] = num;
        }
        
        if (uniqueArray.length < 3) {
            Arrays.sort(uniqueArray);
            return uniqueArray[uniqueArray.length - 1]; // Return the maximum element
        } else {
            Arrays.sort(uniqueArray);
            return uniqueArray[uniqueArray.length - 3]; // Return the third maximum element
        }
    }
}