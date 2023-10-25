class Solution {
   public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] output = new int[nums1.length];
       
        for (int i = 0; i < nums1.length; i++) {
            int j = 0; // Reset the index for nums2
            while (j < nums2.length) {
                if (nums1[i] != nums2[j]) {
                    j++;
                } else {
                    output[i] = findMax(nums1[i], nums2, j);
                    break; // Exit the loop once a match is found
                }
            }
        }

        return output;
    }
    
    static int findMax(int i, int[] nums2, int start) {
        int max = i;
        
        for (int k = start; k < nums2.length; k++) {
            if (max < nums2[k]) {
                max = nums2[k];
                break; // Exit the loop once a greater element is found
            }
        }
        
        if (max == i) {
            return -1;
        } else {
            return max;
        }
    }
}