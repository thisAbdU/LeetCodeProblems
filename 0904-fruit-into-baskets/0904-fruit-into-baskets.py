import collections
from typing import List

class Solution:
    def totalFruit(self, fruits: List[int]) -> int:
        count = collections.defaultdict(int)
        left, currTotal, maxi = 0, 0, 0
        
        for right in range(len(fruits)):
            count[fruits[right]] += 1
            currTotal += 1
            
            while len(count) > 2:
                count[fruits[left]] -= 1
                currTotal -= 1
                if count[fruits[left]] == 0:
                    count.pop(fruits[left])
                left += 1
            
            maxi = max(currTotal, maxi)
        
        return maxi
