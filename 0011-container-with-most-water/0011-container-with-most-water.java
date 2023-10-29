class Solution {
    public int maxArea(int[] height) {
       int maxArea = Integer.MIN_VALUE;
       int i = 0;
       int j = height.length - 1;
        
        while (i < j) {
           int h1 = height[i];
           int h2 = height[j];
           int minH = Math.min(h1, h2);
           maxArea = Math.max(maxArea, minH * (j - i));

           if (h1 < h2) {
               i++;
           } else {
               j--;
           }
        }
        
        return maxArea;
    }
}
