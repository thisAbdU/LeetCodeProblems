class Solution:
    def countBattleships(self, board: List[List[str]]) -> int:
        no_battleships = 0
        visited = set()
        
        directions = [(0, -1), (0, 1), (1, 0), (-1, 0)]
        
        def traverse(row, col):
            
            if board[row][col] != 'X':
                return 0
            
            if (row, col) in visited:
                return 0
            
            visited.add((row, col))
            board[row][col] = '.'
            
            for r, c in directions:
                next_r, next_c = row + r, col + c
                if 0 <= next_r < len(board) and 0 <= next_c < len(board[0]):
                    if board[next_r][next_c] == 'X':
                        traverse(next_r, next_c)
                    
        for i in range(len(board)):
            for j in range(len(board[0])):
                if board[i][j] == 'X':
                    no_battleships += 1
                    traverse(i, j)
                   
        
        return no_battleships
                    
        