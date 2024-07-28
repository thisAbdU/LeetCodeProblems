class Solution:
    def secondMinimum(self, n: int, edges: List[List[int]], time: int, change: int) -> int:
        graph = [[] for _ in range(n+1)]
        for edge in edges:
            fr, to = edge
            graph[fr].append(to)
            graph[to].append(fr)

        first = [float('inf')] * (n+1)
        second = [float('inf')] * (n+1)
        # first[1] = 0
        queue = deque([1])

        total_time = 0

        while queue:
            for _ in range(len(queue)):
                curr = queue.popleft()        

                if total_time <= first[curr]:
                    first[curr] = total_time
                elif total_time < second[curr]:
                    second[curr] = total_time
                else:
                    continue
                 
                if second[n] != float('inf'):
                    return second[n]

                for nei in graph[curr]:
                    queue.append(nei)

            if (total_time // change) % 2 == 1:
                total_time += change - (total_time % change)
            total_time += time

        return -1