class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        letterSet = set()  
        start = 0
        output = 0

        for end in range(len(s)):
            while s[end] in letterSet:
                letterSet.remove(s[start])
                start += 1
            letterSet.add(s[end])
            output = max(output, end - start + 1)

        return output
