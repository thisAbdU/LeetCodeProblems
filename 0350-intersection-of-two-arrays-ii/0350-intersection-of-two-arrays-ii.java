class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> mapArrays = new HashMap<>();

        for(int num: nums1){
            mapArrays.put(num, mapArrays.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer> output = new ArrayList<>();

        for(int num: nums2){
            if (mapArrays.containsKey(num) && mapArrays.get(num)> 0) {
                output.add(num);
                mapArrays.put(num, mapArrays.get(num) - 1);
            }
        }

        int[] intersection = new int[output.size()];
        for (int i = 0; i < output.size(); i++) {
            intersection[i] = output.get(i);
        }

        return intersection;
    }
}