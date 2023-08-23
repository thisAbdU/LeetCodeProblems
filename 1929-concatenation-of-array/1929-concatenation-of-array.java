class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] newList = new int[2*nums.length];
        for(int i = 0; i < newList.length; i++){
            if(i<nums.length){
                newList[i]= nums[i];
            }
            else{
                newList[i] = nums[i%nums.length];
            }
        }return newList;
    }
}