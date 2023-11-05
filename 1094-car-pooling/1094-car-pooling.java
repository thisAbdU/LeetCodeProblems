import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        // Sort the trips by their start location
        Arrays.sort(trips, Comparator.comparingInt(a -> a[1]));

        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));

        int currentPassenger = 0;

        for (int[] trip : trips) {
            // Remove passengers who have reached their destination
            while (!minHeap.isEmpty() && minHeap.peek()[1] <= trip[1]) {
                currentPassenger -= minHeap.poll()[0];
            }

            // Add passengers from the current trip
            currentPassenger += trip[0];

            // Check if the current passenger count exceeds the capacity
            if (currentPassenger > capacity) {
                return false;
            }

            // Add the current trip to the minHeap to track passengers on the way
            minHeap.add(new int[]{trip[0], trip[2]});
        }

        return true;
    }
}
