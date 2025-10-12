class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }

    private void helper(TreeNode n, List<Integer> r) {
        if (n == null) return;
        helper(n.left, r);
        helper(n.right, r);
        r.add(n.val);
    }
}
