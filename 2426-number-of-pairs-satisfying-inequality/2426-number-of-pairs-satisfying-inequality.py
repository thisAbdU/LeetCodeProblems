from sortedcontainers import SortedList

class Solution:
    def numberOfPairs(self, nums1: List[int], nums2: List[int], diff: int) -> int:
        sl = SortedList()
        cnt = 0
        
        for i in range(len(nums1)):
            howmany = sl.bisect_right(nums1[i] - nums2[i] + diff)        
            cnt += howmany    
            sl.add(nums1[i] - nums2[i])
            
        return cnt