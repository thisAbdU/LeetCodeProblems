class Solution:
    def minScore(self, n: int, roads: List[List[int]]) -> int:
        graph = defaultdict(list)
        for u, v, w in roads:
            graph[u].append((v, w))
            graph[v].append((u, w))
        
        
        min_score = float('inf')
        visited = [False] * (n + 1)
        queue = deque([1])
        visited[1] = True
        
        
        while queue:
            node = queue.popleft()
            for neighbor, weight in graph[node]:
                min_score = min(min_score, weight)
                if not visited[neighbor]:
                    visited[neighbor] = True
                    queue.append(neighbor)
        
        return min_score