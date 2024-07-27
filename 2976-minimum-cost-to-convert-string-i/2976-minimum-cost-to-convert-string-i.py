class Solution:
    def minimumCost(self, source: str, target: str, original: list[str], changed: list[str], cost: list[int]) -> int:
        adjacency_list = [[] for _ in range(26)]
        for i in range(len(original)):
            source_char_index = ord(original[i]) - ord("a")
            target_char_index = ord(changed[i]) - ord("a")
            conversion_cost = cost[i]
            adjacency_list[source_char_index].append((target_char_index, conversion_cost))

        def dijkstra(start: int, adjacencyList: list[list[tuple[int, int]]]) -> list[float]:
            priority_queue = [(0, start)]
            min_costs = [float("inf")] * 26
            while priority_queue:
                current_cost, current_char = heapq.heappop(priority_queue)
                if min_costs[current_char] != float("inf"):
                    continue
                min_costs[current_char] = current_cost
                for target_char, conversion_cost in adjacencyList[current_char]:
                    new_total_cost = current_cost + conversion_cost
                    if min_costs[target_char] == float("inf"):
                        heapq.heappush(priority_queue, (new_total_cost, target_char))
            return min_costs

        min_conversion_costs = [dijkstra(start_char, adjacency_list) for start_char in range(26)]
        total_cost = 0
        for s, t in zip(source, target):
            if s != t:
                char_conversion_cost = min_conversion_costs[ord(s) - ord("a")][ord(t) - ord("a")]
                if char_conversion_cost == float("inf"):
                    return -1
                total_cost += int(char_conversion_cost)
        return total_cost
