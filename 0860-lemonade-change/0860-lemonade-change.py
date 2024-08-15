class Solution:
    def lemonadeChange(self, bills: List[int]) -> bool:
        changes = {5: 0, 10: 0, 20:0}
        for b in  bills:
            if b == 5:
                changes[b] += 1
            elif b == 10:
                if changes[5] < 1:
                    return False
                else:
                    changes[b] += 1
                    changes[5] -= 1
            elif b == 20:
                if changes[10] >= 1 and changes[5] >= 1:
                    changes[b] += 1
                    changes[5] -= 1
                    changes[10] -= 1
                elif changes[5] >= 3:
                    changes[b] += 1
                    changes[5] -= 3
                else:
                    return False
        return True
    
        