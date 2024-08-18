class Solution:
    def nthUglyNumber(self, n: int) -> int:
        heap = [1]
        count = 1
        
        if n == count:
            return heap[0]
        
        visited = set([1]) 

        while n > count:
            a = heapq.heappop(heap)
            count += 1
            
            l2, l3, l5 = a*2, a*3, a*5
            if l2 not in visited:
                heapq.heappush(heap, l2)
            if l3 not in visited:
                heapq.heappush(heap, l3)
            if l5 not in visited:
                heapq.heappush(heap, l5)
            
            visited.update([l2, l3, l5])
            
        return heap[0]