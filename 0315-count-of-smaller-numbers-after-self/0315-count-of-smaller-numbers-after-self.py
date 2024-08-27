from sortedcontainers import SortedList

class Solution:
    def countSmaller(self, nums: List[int]) -> List[int]:
        sl = SortedList()
        nums.reverse()
        
        res = []
        
        for n in nums:
            indx = sl.bisect_left(n)
            res.append(indx)
            sl.add(n)
            
        res.reverse()
        return res
