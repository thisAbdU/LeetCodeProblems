class Solution:
    def frequencySort(self, nums: List[int]) -> List[int]:
        nums.sort(reverse=True)
        num_freq = defaultdict(int)
        for num in nums:
            num_freq[num] += 1
        
        ans = []
        sortedNum = sorted(num_freq.items(), key=lambda x:x[1])
        
        for x, y in sortedNum:
            temp = y * [x]
            ans.extend(temp)
        
        return ans
        