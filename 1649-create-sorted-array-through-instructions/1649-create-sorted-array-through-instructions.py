from sortedcontainers import SortedList
from typing import List

class Solution:
    def createSortedArray(self, instructions: List[int]) -> int:
        sl = SortedList()
        cost = 0
        MOD = 10**9 + 7
        
        for x in instructions:
            less_than_x = sl.bisect_left(x)
            greater_than_x = len(sl) - sl.bisect_right(x)
            
            cost += min(less_than_x, greater_than_x)
            
            sl.add(x)
        
        return cost%MOD
