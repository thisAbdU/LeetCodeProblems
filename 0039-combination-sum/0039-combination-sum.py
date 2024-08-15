class Solution:
    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        ans = []
        candidates.sort()
        
        def find_targ(total, temp, indx):
            if total == target:
                ans.append(temp[:])
                return 
            
            for i in range(indx, len(candidates)):
                if total + candidates[i] > target:
                    break
                
                temp.append(candidates[i])
                find_targ(total + candidates[i], temp, i)
                temp.pop()
                
        find_targ(0, [], 0)
        return ans