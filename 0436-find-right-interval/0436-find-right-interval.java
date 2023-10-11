class Solution {
    public int[] findRightInterval(int[][] intervals) {
        // Create a TreeMap to map the start points of intervals to their indices
        TreeMap<Integer, Integer> intervalMap = new TreeMap<>();
        int n = intervals.length;
        int[] result = new int[n];

        // Populate the TreeMap with the start points and their corresponding indices
        for (int i = 0; i < n; i++) {
            intervalMap.put(intervals[i][0], i);
        }

        // Iterate through the intervals and find the right interval
        for (int i = 0; i < n; i++) {
            Integer key = intervalMap.ceilingKey(intervals[i][1]); // Find the smallest start point greater than or equal to intervals[i][1]
            result[i] = (key != null) ? intervalMap.get(key) : -1;
        }

        return result;
    }
}