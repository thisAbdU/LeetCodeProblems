class Solution:
    def findChampion(self, grid: List[List[int]]) -> int:
        n = len(grid)
        teams = [True for _ in range(n)]
        
        for i in range(n):
            for j in range(n):
                if i != j:
                    if grid[i][j] == 0:
                        teams[i] = False
        
        for i, team in enumerate(teams):
            if team:
                return i
        
        return -1