class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int i = piles.length - 2;
        int j = (int)piles.length/3;
        int maxCoins = 0;
        
        while(i >= j){
            maxCoins += piles[i];
            i -= 2;
        }
        
        return maxCoins;
    }
}