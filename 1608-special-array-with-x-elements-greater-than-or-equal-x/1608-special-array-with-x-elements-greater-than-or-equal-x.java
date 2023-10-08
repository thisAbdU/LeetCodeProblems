class Solution {
    public int specialArray(int[] nums) {
    for (int x = 0; x <= 1000; x++) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (x <= nums[i]) {
                count++;
            }
        }
        if (count == x) {
            return x;
        }
    }
    return -1;
}

}