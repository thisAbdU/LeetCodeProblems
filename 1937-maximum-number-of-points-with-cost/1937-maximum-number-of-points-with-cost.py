class Solution(object):
    def maxPoints(self, points):
        ROWS=len(points)
        COLS=len(points[0])
        prev=points[0]        
        for r in range(1,ROWS):

            left=[0 for c in range(COLS)]
            left[0]=prev[0]
            for c in range(1, COLS):
                left[c]=max( prev[c] , left[c-1]-1)
            
            right=[0 for c in range(COLS)]
            right[-1]=prev[-1]
            for c in range( COLS-2, -1, -1):
                right[c]=max(right[c+1]-1, prev[c])

            cur=[0 for c in range(COLS)]
            for c in range(COLS):
                cur[c]=points[r][c] + max(left[c], right[c])
            
            prev=cur

        return max(prev)