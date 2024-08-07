class Solution(object):
    def unit_digit(self, n):
        return ["", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"][n]
    
    def ten_digit(self, n):
        return ["", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"][n]
    
    def teen(self, n):
        return ["Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"][n - 10]
    
    def character(self, n):
        ans = ""
        hun, rem = divmod(n, 100)
        ten, one = divmod(rem, 10)
        
        if hun:
            ans += self.unit_digit(hun) + " Hundred "
        if ten == 1:
            ans += self.teen(rem)
        else:
            if ten:
                ans += self.ten_digit(ten) + " "
            if one:
                ans += self.unit_digit(one)
        return ans.strip()
    
    def numberToWords(self, num):
        if num == 0:
            return "Zero"
        
        ans = ""
        units = ["", "Thousand", "Million", "Billion"]
        parts = []
        
        while num > 0:
            parts.append(num % 1000)
            num //= 1000
        
        for i in range(len(parts)):
            if parts[i] > 0:
                ans = self.character(parts[i]) + (" " + units[i] if units[i] else "") + (" " + ans if ans else "")
        
        return ans.strip()
