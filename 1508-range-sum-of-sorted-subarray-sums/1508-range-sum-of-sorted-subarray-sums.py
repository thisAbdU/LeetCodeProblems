class Solution:
    def rangeSum(self, nums, n, left, right):
        mod = 10**9 + 7
        arr = []
        for i in range(len(nums)):
            sum_ = 0
            for j in range(i, len(nums)):
                arr.append(nums[j] + sum_)
                sum_ += nums[j]
                
        arr.sort()
        
        total = sum(arr[left-1:right])
        
        return total%mod
        
                
            
        