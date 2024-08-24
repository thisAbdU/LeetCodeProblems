class Solution:
    def nearestPalindromic(self, n: str) -> str:
        if len(n) == 1:
            return str(int(n) - 1)
        
        candid = set()
        l = len(n)
        
        candid.add(str(10**l + 1))
        candid.add(str((10**(l - 1)) - 1))
        
        pre = n[:(l + 1)//2]

        
        for i in [-1, 0, 1]:
            p = str(int(pre) + i)
            if l%2 == 0:
                cand = p + p[::-1]
            else:
                cand = p + p[-2::-1]
            
            candid.add(cand)
            
        candid.discard(n)
        
        mind = float('inf')
        clos = n
        
        for num in candid:
            diff = abs(int(num) - int(n))
            if diff < mind or (mind == diff and int(num) < int(clos)):
                clos = int(num)
                mind = diff
                
        return str(clos)
                
        