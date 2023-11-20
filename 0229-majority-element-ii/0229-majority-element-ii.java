class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;

        // Handle cases when the array length is less than 3
        if (n == 1) {
            return Arrays.asList(nums[0]);
        }

        if (n == 2 && nums[0] != nums[1]) {
            return Arrays.asList(nums[0], nums[1]);
        }

        int threshold = n / 3;
        Arrays.sort(nums);
        List<Integer> majorElt = new ArrayList<>();

        int count = 1;

        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count > threshold && !majorElt.contains(nums[i])) {
                majorElt.add(nums[i]);
            }
        }

        return majorElt;
    }
}