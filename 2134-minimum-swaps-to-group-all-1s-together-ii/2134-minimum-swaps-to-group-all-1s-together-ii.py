class Solution:
    def minSwaps(self, nums: List[int]) -> int:
        n = len(nums)
        
        if len(nums) <= 3:
            return 0
        
        total = sum(nums)
        prefix = [0]
        
        nums.extend(nums)
        
        for num in nums:
            prefix.append(prefix[-1] + num)
        
        max_sum = 0
        
        for i in range(n):
            max_sum = max(max_sum, prefix[i + total] - prefix[i])
        
        return total - max_sum
            
            
            
        
        