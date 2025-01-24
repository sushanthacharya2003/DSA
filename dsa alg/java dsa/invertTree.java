public class invertTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) { // Step 1: Base case
            return null;
        }

        // Step 2: Swap the left and right children
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        // Step 3: Recursively invert the left and right subtrees
        invertTree(root.left);
        invertTree(root.right);

        // Step 4: Return the root
        return root;
    }
}