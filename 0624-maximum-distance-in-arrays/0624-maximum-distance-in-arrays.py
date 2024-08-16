class Solution:
    def maxDistance(self, arrays: List[List[int]]) -> int:
        mn, mx = arrays[0][0], arrays[0][-1]
        res = 0
        for i in range(1, len(arrays)):
            res = max(res, mx - arrays[i][0])
            res = max(res, arrays[i][-1] - mn)
            mn, mx = min(mn, arrays[i][0]), max(mx, arrays[i][-1])
        return res