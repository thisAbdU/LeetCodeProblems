class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> disappearedNumbers = new ArrayList<>();
        sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                disappearedNumbers.add(i + 1);
            }
        }
        return disappearedNumbers;
    }
    
    static int[] sort(int[] nums) {
       int i = 0;
       while (i < nums.length) {
        int correct = nums[i] - 1;
        
        if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }
            else{
                  i++;
            }

       }
       return nums;
        
    }

    static void swap(int[] nums, int numOne, int numTwo){
        int temp = nums[numOne];
        nums[numOne] = nums[numTwo];
        nums[numTwo] = temp;
    }
}