class Solution:
    def findChampion(self, n, v):
        m = len(v)
        in_count = [0] * n
        for i in range(m):
            in_count[v[i][1]] += 1
        ans = []
        for i in range(n):
            if in_count[i] == 0:
                ans.append(i)
        if len(ans) > 1:
            return -1
        return ans[0]