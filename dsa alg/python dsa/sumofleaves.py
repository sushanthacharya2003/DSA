class Solution:
    def binaryTreePaths(self, root: Optional[TreeNode]) -> List[str]:
        def dfs(node, path, res):
            if not node:
                return
            path += str(node.val)
            if not node.left and not node.right:  # Leaf node
                res.append(path)
                return
            path += "->"
            dfs(node.left, path, res)
            dfs(node.right, path, res)

        result = []
        dfs(root, "", result)
        return result
