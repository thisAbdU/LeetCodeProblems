class Solution:
    def smallestDistancePair(self, nums: List[int], k: int) -> int:
        def count_pairs_with_max_diff(nums: List[int], mid: int) -> int:
            left = 0
            count = 0
            n = len(nums)
            
            for right in range(n):
                while nums[right] - nums[left] > mid:
                    left += 1
                
                count += right - left
            
            return count
        
        nums.sort()
        low, high = 0, nums[-1] - nums[0]
        
        while low < high:
            mid = (low + high) // 2
            
            count = count_pairs_with_max_diff(nums, mid)
            
            if count >= k:
                high = mid 
            else:
                low = mid + 1 
        
        return low
