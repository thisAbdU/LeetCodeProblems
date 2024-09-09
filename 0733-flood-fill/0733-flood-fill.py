class Solution:
    def floodFill(self, image: List[List[int]], sr: int, sc: int, color: int) -> List[List[int]]:
        val = image[sr][sc]
        image[sr][sc] = color
        visited = set()
        
        directions = [(0, 1), (0, -1), (1, 0), (-1, 0)]
        
        
        def inbound(row, col):
            return (0 <= row < len(image)) and (0 <= col < len(image[0]))
        
        def traverse(row, col):
            if (row, col) in visited:
                return 
            
            visited.add((row, col))
            
            for r, j in directions:
                next_r, next_j = row + r, col + j
                if inbound(next_r, next_j):
                    if image[next_r][next_j] == val:
                        image[next_r][next_j] = color
                        traverse(next_r, next_j)
                        
            
            return image
        
        return traverse(sr, sc)
                        