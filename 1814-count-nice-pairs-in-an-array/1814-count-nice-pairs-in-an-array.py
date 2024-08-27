class Solution:
    def countNicePairs(self, nums: List[int]) -> int:
        cnt = defaultdict(int)
        MOD = 10**9 + 7
        nice = 0
        for n in nums:
            diff = n - int(str(n)[::-1])
            
            if diff in cnt:
                nice += cnt[diff]
            
            cnt[diff] += 1
            
        return nice%MOD