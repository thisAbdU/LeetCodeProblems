"""
# Definition for a Node.
class Node:
    def __init__(self, val=None, children=None):
        self.val = val
        self.children = children
"""

class Solution:
    def levelOrder(self, root: 'Node') -> List[List[int]]:
        if root is None:
            return []
            
        queue = [root]
        res = []
        
        while queue:          
            l = len(queue)
            now = []          
            for _ in range(l):  
                curr = queue.pop(0)
                now.append(curr.val)
                for c in curr.children:                    
                    queue.append(c)
            res.append(now)     
            
        return res
            
            