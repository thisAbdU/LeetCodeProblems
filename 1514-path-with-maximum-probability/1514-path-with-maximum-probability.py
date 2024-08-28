class Solution:
    def maxProbability(self, n: int, edges: List[List[int]], succProb: List[float], start_node: int, end_node: int) -> float:
        graph = [[] for _ in range(n)]
        for i, (u, v) in enumerate(edges):
            graph[u].append((v, succProb[i]))
            graph[v].append((u, succProb[i]))
        
        max_heap = [(-1.0, start_node)] 
        max_prob = [0.0] * n  
        max_prob[start_node] = 1.0 
        
        while max_heap:
            curr_prob, node = heappop(max_heap)
            curr_prob = -curr_prob
            
            if node == end_node:
                return curr_prob
            

            for neighbor, prob in graph[node]:
                new_prob = curr_prob * prob
                if new_prob > max_prob[neighbor]:
                    max_prob[neighbor] = new_prob
                    heappush(max_heap, (-new_prob, neighbor))
        
        return 0.0
