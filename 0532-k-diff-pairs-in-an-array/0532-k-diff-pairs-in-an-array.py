class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        cnt = 0
        if k < 0:
            return 0
        
        nums.sort()
        lf, rt = 0, 1
        
        while rt < len(nums):
            if lf == rt:
                rt += 1
                continue
            
            diff = abs(nums[rt] - nums[lf])
            
            if diff == k:
                rt += 1
                lf += 1
                cnt += 1
                while rt < len(nums) and nums[rt] == nums[rt - 1]:
                    rt += 1
                    
            elif diff < k:
                rt += 1
            
            else:
                lf += 1
                
        return cnt
                