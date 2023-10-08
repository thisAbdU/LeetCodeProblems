class Solution {
    public boolean checkIfExist(int[] arr) {
        int left = 0;
        
        while (left < arr.length) {
            int target = arr[left] * 2;
            
            if (checkNum(arr, target, left)) {
                return true;
            }
            
            left++;
        }
        
        return false;
    }

    boolean checkNum(int[] arr, int target, int excludeIndex) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target && i != excludeIndex) {
                return true;
            }
        }
        return false;
    }
}