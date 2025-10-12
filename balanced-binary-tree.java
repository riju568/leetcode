class Solution {
    public boolean isBalanced(TreeNode root) {
        // Returns true if tree is height-balanced
        return getHeight(root) != -1;
    }

    private int getHeight(TreeNode node) {
        if (node == null) return 0;

        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);

        // If left or right subtree is unbalanced, or difference > 1 → unbalanced
        if (leftHeight == -1 || rightHeight == -1 || Math.abs(leftHeight - rightHeight) > 1)
            return -1;

        // Return height of current node
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
