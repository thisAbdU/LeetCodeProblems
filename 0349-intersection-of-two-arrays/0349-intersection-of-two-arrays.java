class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> intersectionSet = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    intersectionSet.add(nums2[j]);
                }
            }
        } 

        int[] numArray = new int[intersectionSet.size()];
        int index = 0;

        for (int num : intersectionSet) {
            numArray[index++] = num;
        }
        return numArray;
    }
}