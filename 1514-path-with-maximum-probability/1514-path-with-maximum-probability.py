class Solution:
    def maxProbability(self, n: int, edges: List[List[int]], succProb: List[float], start_node: int, end_node: int) -> float:
        adj = defaultdict(list)

        for node in range(len(edges)):
            adj[edges[node][0]].append((edges[node][1],succProb[node]))
            adj[edges[node][1]].append((edges[node][0],succProb[node]))
        
        def dijkstra(src,dst):
            heap = [(-1,src)]
            visited = set()
            while heap:
                cost,node = heapq.heappop(heap)
                if node == dst:
                    return - cost
                if node in visited:
                    continue
                visited.add(node)
                for nei,cost_2 in adj[node]:
                    if nei not in visited:
                        heapq.heappush(heap,((cost * cost_2),nei))
            return 0
        return dijkstra(start_node,end_node)