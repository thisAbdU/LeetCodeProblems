class Solution:
    def sortPeople(self, names: List[str], heights: List[int]) -> List[str]:
        height_name = []
        for i, j in zip(names, heights):
            height_name.append([j, i])
            
        height_name.sort(reverse=True)

        ans = [i[1] for i in height_name]
        
        return ans