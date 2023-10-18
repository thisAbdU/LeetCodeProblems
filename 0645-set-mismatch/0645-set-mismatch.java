class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] result  = new int[2];

        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            }else{
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                result[0] = nums[j];
                result[1] = j + 1;
            }
        }return result;
        
    }

    static void swap(int[] nums, int numONe, int numTwo){
        int temp = nums[numONe];
        nums[numONe] = nums[numTwo];
        nums[numTwo] = temp;
    }
}