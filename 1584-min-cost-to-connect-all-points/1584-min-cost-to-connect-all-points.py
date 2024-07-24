class Solution:
    def minCostConnectPoints(self, points: List[List[int]]) -> int:
        n = len(points)
        adjList = {i:[] for i in range(n)}
        
        for i in range(n):
            x1, y1 = points[i]
            for j in range(i + 1, n):
                x2, y2 = points[j]
                dist = abs(x1 - x2) + abs(y2 - y1)
                adjList[i].append([dist, j])
                adjList[j].append([dist, i])
        totalCost = 0
        minH = [[0, 0]]
        visited = set()
        
        while len(visited) < n:
            cost, edg = heapq.heappop(minH)
            if edg not in visited:
                totalCost += cost
                visited.add(edg)
                for neiCost, neiedg in adjList[edg]:
                    if neiedg not in visited:
                        heapq.heappush(minH, [neiCost, neiedg])
            else:
                continue
        
        return totalCost
                    
        
                
        