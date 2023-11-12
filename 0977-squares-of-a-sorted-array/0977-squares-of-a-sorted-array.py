class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        n = len(nums)
        newArr = [0] * n  # Initialize newArr with appropriate length
        
        i = 0
        j = n - 1
        k = n - 1
        
        while i <= j:
            if abs(nums[i]) > abs(nums[j]):
                newArr[k] = nums[i] ** 2
                i += 1
            else:
                newArr[k] = nums[j] ** 2
                j -= 1
            k -= 1
        
        return newArr
