class Solution {
    public int findKthPositive(int[] arr, int k) {
       int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left)/2;
            int missingNum = arr[mid] - (mid + 1);
            if(missingNum < k){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }return left + k;
    }
}  
    
