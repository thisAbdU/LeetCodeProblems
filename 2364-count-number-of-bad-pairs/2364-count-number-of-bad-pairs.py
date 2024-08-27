class Solution:
    def countBadPairs(self, nums: List[int]) -> int:
        cnt = defaultdict(int)
        good_pairs = 0
        
        for i in range(len(nums)):
            diff = nums[i] - i
            if diff in cnt:
                good_pairs += cnt[diff]
            cnt[diff] += 1
        
        total_pairs = len(nums) * (len(nums) - 1) // 2
        bad_pairs = total_pairs - good_pairs
        return bad_pairs
