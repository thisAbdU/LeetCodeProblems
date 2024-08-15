class Solution:
    def combinationSum2(self, candidates: List[int], target: int) -> List[List[int]]:
        res = []
        candidates.sort()  
        
        def find_targ(total, temp, indx):
            if total == target:
                res.append(temp[:])
                return 
            
            for i in range(indx, len(candidates)):
                if i > indx and candidates[i] == candidates[i-1]:
                    continue
                if candidates[i] + total > target:
                    break 
                
                temp.append(candidates[i])
                find_targ(total + candidates[i], temp, i + 1)
                temp.pop()
        
        find_targ(0, [], 0)
        return res
