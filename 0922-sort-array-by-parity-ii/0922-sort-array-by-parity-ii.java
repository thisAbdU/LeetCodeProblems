class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] sortedArray = new int[nums.length];
        int i = 0;
        int j = 1;
        
        for(int num: nums){
            if(num%2 == 0){
                sortedArray[i] = num;
                i+=2;
            }else{
                sortedArray[j] = num;
                j+=2;
            }
        }
        return sortedArray;
    }
}