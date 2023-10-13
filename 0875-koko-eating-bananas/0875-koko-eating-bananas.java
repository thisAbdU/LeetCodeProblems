class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = maximum(piles);

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (requiredTime(piles, mid) > h) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return high;
    }

    public int maximum(int[] piles) {
        int max = piles[0];
        for (int i = 0; i < piles.length; i++) {
            if (max < piles[i]) {
                max = piles[i];
            }
        }
        return max;
    }

    public int requiredTime(int[] piles, int mid) {
        int sum = 0;
        for (int i = 0; i < piles.length; i++) {
            sum += Math.ceil((double) piles[i] / mid);
        }
        return sum;
    }
}