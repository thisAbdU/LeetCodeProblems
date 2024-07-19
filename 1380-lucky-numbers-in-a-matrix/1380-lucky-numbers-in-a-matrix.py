class Solution:
    def luckyNumbers (self, matrix: List[List[int]]) -> List[int]:
        m, n = len(matrix), len(matrix[0])
        ans = []
        luckyRow = {}
        luckyCol = defaultdict(int)
        
        for row in range(m):
            luckyRow[row] = min(matrix[row])
        
        for row in range(m):
            for col in range(n):
                luckyCol[col] = max(matrix[row][col], luckyCol[col])
        
        for num in luckyRow.values():
            if num in luckyCol.values():
                ans.append(num)
        
        return ans
                
                
        