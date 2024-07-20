class Solution:
    def restoreMatrix(self, rowSum: List[int], colSum: List[int]) -> List[List[int]]:
        n, m = len(rowSum), len(colSum)
        ans = [[0 for _ in range(m)] for _ in range(n)]
        
        for i in range(n):
            for j in range(m):
                if rowSum[i] <= colSum [j]:
                    ans[i][j] = rowSum[i]
                    colSum[j] -= rowSum[i]
                    rowSum[i] = 0
                else:
                    ans[i][j] = colSum[j]
                    rowSum[i] -= colSum[j]
                    colSum[j] = 0
        return ans