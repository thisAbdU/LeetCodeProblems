class Solution:
    def minHeightShelves(self, books: List[List[int]], shelfWidth: int) -> int:
        n = len(books)
        dp = {}
        
        
        def getminH(indx):
            if indx == n:
                return 0
            
            if indx in dp:
                return dp[indx]
            
            min_ = float('inf')
            levelH, width = 0, 0
            
            for i in range(n):
                if i + indx >= n:
                    break
                    
                width += books[indx + i][0]
                
                if width > shelfWidth:
                    break
                
                levelH = max(levelH, books[indx + i][1])
                min_ = min(min_, getminH(indx + i + 1) + levelH)
                
                dp[indx] = min_
                
            return min_
        
        return getminH(0)
                
            