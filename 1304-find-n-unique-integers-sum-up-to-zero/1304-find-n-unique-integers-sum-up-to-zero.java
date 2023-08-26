class Solution {
  public int[] sumZero(int n) {
        int[] ans = new int[n];
        int temp = n/2;
        int j = n-1;
        for(int i = 0; i < j; i++){
            ans[i] = temp;
            ans[j] = - temp;
            temp --;
            j--;
        }
 return ans;
}
}