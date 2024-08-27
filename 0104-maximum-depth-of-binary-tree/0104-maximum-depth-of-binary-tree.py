# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def maxDepth(self, root: Optional[TreeNode]) -> int:
 
        def traverse(root, height):
            if root is None:
                return height
            
            left = traverse(root.left, height + 1)
            right = traverse(root.right, height + 1)
            
            return max(left, right)
        
        return traverse(root, 0)