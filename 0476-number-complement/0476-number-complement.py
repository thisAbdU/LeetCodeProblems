class Solution:
    def findComplement(self, n: int) -> int:
        no = math.floor(math.log2(n)) + 1
        return ((1 << no) - 1) ^ n