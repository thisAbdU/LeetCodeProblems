class Solution:
    def sortJumbled(self, mapping: List[int], nums: List[int]) -> List[int]:
        def decode(num):
            if num <= 9:
                return mapping[num]
            i = num%10
            return decode(num//10)*10 + mapping[i]
        
        nums.sort(key=lambda x: decode(x))
        return nums  