class Solution:
    def findAllPeople(self, n: int, meetings: List[List[int]], firstPerson: int) -> List[int]:
        parents = [i for i in range(n)]
        ranks = [1 for i in range(n)]
        
        def find(i):
            if parents[i] != i:
                parents[i] = find(parents[i])
            return parents[i]
        
        def union(x, y):
            parentx, parenty = find(x), find(y)
            if parentx != parenty:
                if ranks[parentx] <= ranks[parenty]:
                    parents[parentx] = parenty
                    ranks[parenty] += ranks[parentx]
                else:
                    parents[parenty] = parentx
                    ranks[parentx] += ranks[parenty]
                    
        meetings.sort(key=lambda x: x[2])
        
        union(0, firstPerson)
        
        i = 0
        while i < len(meetings):
            current_time = meetings[i][2]
            same_time_meetings = []
            
            
            while i < len(meetings) and meetings[i][2] == current_time:
                same_time_meetings.append((meetings[i][0], meetings[i][1]))
                i += 1
            

            for x, y in same_time_meetings:
                union(x, y)
            
            temp_parents = parents[:]
            for x, y in same_time_meetings:
                if find(x) != find(0):
                    temp_parents[x] = x
                if find(y) != find(0):
                    temp_parents[y] = y
            
            parents = temp_parents
        
        return [i for i in range(n) if find(i) == find(0)]
