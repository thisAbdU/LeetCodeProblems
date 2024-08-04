class Solution:
    def rangeSum(self, nums, n, left, right):
        MOD = 10**9 + 7
        subarray_sums = []
        
        for i in range(n):
            current_sum = 0
            for j in range(i, n):
                current_sum += nums[j]
                subarray_sums.append(current_sum)
        
        subarray_sums.sort()
        return sum(subarray_sums[left-1:right]) % MOD