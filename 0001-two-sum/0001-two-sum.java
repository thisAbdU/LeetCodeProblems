class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> sumIndice = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[i] + nums[j] == target) {
                    sumIndice.add(i);
                    sumIndice.add(j);
                }
            }
        }

        int[] arr = new int[sumIndice.size()];
        for (int i = 0; i < sumIndice.size(); i++) {
            arr[i] = sumIndice.get(i);
        }

        return arr;
    }
}