class Solution:
    def countSmaller(self, nums: List[int]) -> List[int]:
        n = len(nums)
        counts = [0] * n
        indices = list(range(n))
        
        def mergesort(left, right):
            if right - left <= 1:
                return
            
            mid = (left + right) // 2
            mergesort(left, mid)
            mergesort(mid, right)
            merge(left, mid, right)
        
        def merge(left, mid, right):
            i = left
            j = mid
            temp = []
            while i < mid and j < right:
                if nums[indices[i]] <= nums[indices[j]]:
                    temp.append(indices[i])
                    counts[indices[i]] += (j - mid) 
                    i += 1
                else:
                    temp.append(indices[j])
                    j += 1
 
            while i < mid:
                temp.append(indices[i])
                counts[indices[i]] += (j - mid)
                i += 1
            
            while j < right:
                temp.append(indices[j])
                j += 1
            
            for k in range(left, right):
                indices[k] = temp[k - left]
 
        mergesort(0, n)
        return counts
