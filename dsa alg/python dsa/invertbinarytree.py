class Solution(object):
    def invertTree(self, root):
        if not root:
            return None
        
        root.left, root.right = root.right, root.left

        self.invertTree(root.left)
        self.invertTree(root.right)

        return root

def main():
    root = [4, 2, 7, 1, 3, 6, 9]
    solution = Solution()
    print(solution.invertTree(root))

if __name__ == "__main__":
    main()