class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        expectedSum = (len(nums)/2)*(len(nums) + 1)
        actualSum = 0
        i = 0

        while(i < len(nums)):
            actualSum += nums[i]
            i += 1
        return int(expectedSum - actualSum)