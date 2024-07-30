class Solution:
    def minimumDeletions(self, s: str) -> int:
        a_count = s.count('a')
        b_count = 0
        min_deletions = float('inf')
        
        for char in s:
            if char == 'a':
                a_count -= 1
            min_deletions = min(min_deletions, a_count + b_count)
            if char == 'b':
                b_count += 1
        
        return min(min_deletions, b_count)
