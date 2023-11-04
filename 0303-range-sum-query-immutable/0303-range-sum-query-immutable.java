class NumArray {
    private int[] sumsArray;

    public NumArray(int[] nums) {
        if (nums.length > 0) {
            sumsArray = new int[nums.length];
            sumsArray[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                sumsArray[i] = sumsArray[i - 1] + nums[i];
            }
        }
    }

    public int sumRange(int left, int right) {
        if (sumsArray == null) {
            return 0; 
        }
        if (left == 0) {
            return sumsArray[right];
        } else {
            return sumsArray[right] - sumsArray[left - 1];
        }
    }

    /**
     * Your NumArray object will be instantiated and called as such:
     * NumArray obj = new NumArray(nums);
     * int param_1 = obj.sumRange(left, right);
     */
}
