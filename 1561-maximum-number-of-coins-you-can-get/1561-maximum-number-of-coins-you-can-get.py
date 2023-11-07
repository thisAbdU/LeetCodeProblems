class Solution:
    def maxCoins(self, piles: List[int]) -> int:
        sortedPiles = sorted(piles, reverse=True)
        sum = 0
        n = len(piles)
        m = 1
        while m < n - (n//3):
            sum += sortedPiles[m]
            m += 2
        return sum