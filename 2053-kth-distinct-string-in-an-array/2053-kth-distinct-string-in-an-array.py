class Solution:
    def kthDistinct(self, arr: List[str], k: int) -> str:
        cnt = 0
        for letter in arr:
            if arr.count(letter) == 1:
                cnt += 1
                if cnt == k:
                    return letter
        return ""