# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def delNodes(self, root: Optional[TreeNode], to_delete: List[int]) -> List[TreeNode]:
        output = []
        to_delete = set(to_delete)

        def traverse(root):
            if root is None:
                return None

            root.left = traverse(root.left)
            root.right = traverse(root.right)

            if root.val in to_delete:
                if root.left:
                    output.append(root.left)
                if root.right:
                    output.append(root.right)
                return None

            return root
            
        if traverse(root):
            output.append(root)

        return output
        


        
        