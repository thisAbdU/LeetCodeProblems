class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
       int sumAlice = Arrays.stream(aliceSizes).sum();
       int sumBob = Arrays.stream(bobSizes).sum();
        
        int targetDiff = (sumAlice - sumBob) / 2;
        
        HashSet<Integer> bobSet = new HashSet<>();
        for (int size : bobSizes) {
            bobSet.add(size);
        }

        for (int aliceSize : aliceSizes) {
            int correspondingBobSize = aliceSize - targetDiff;
            if (bobSet.contains(correspondingBobSize)) {
                return new int[]{aliceSize, correspondingBobSize};
            }
        }
        
        return new int[0]; 
    }
}