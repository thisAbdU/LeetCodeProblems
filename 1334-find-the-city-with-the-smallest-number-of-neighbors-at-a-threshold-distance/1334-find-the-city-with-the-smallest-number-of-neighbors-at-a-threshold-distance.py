class Solution:
    def findTheCity(self, n: int, edges: List[List[int]], distanceThreshold: int) -> int:
        adj = {}                          
        for node in range(n):             
            adj[node] = []
        
        for src, dst, weight in edges:     
            adj[src].append([dst, weight]) 
            adj[dst].append([src, weight])



        def primsAlgo(source, length):    
            minHeap = []                 

            for neighbor, weight in adj[source]:        
                if weight + length > distanceThreshold:
                    continue
                heapq.heappush(minHeap, [weight, source, neighbor]) 
            
            mst = []            
            visit = set()   
            visit.add(source)   

            while minHeap:
                weight, source, dst = heapq.heappop(minHeap)

                if dst in visit:         
                    continue
                
                mst.append([source, dst]) 
                visit.add(dst)          
                length = weight           
                for neighbor, weight in adj[dst]:
                    if neighbor not in visit and length + weight <= distanceThreshold: 
                        heapq.heappush(minHeap, [weight + length, dst, neighbor])     

            return mst
        res = {}      

        for source in adj: 
            res[source] = primsAlgo(source, 0)
        
        final = [-1, inf] 
        for source in res:  
            if source > final[0] and len(res[source]) <= final[1]:
                final = [source, len(res[source])]
        
        return final[0] 