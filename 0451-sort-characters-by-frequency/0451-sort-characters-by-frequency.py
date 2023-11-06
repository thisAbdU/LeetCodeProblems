class Solution:
    def frequencySort(self, s: str) -> str:
        c = Counter(list(s))
        
        output = []
        for char in sorted(c, key=lambda x:c[x], reverse=True):
            output.append(char*c[char])
        
        return "".join(output)