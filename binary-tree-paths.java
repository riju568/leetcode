class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root != null) dfs(root, new ArrayList<>(), result);
        return result;
    }

    private void dfs(TreeNode node, List<Integer> path, List<String> result) {
        path.add(node.val);

        if (node.left == null && node.right == null)
            result.add(makePath(path));
        else {
            if (node.left != null) dfs(node.left, path, result);
            if (node.right != null) dfs(node.right, path, result);
        }

        path.remove(path.size() - 1); // backtrack
    }

    private String makePath(List<Integer> path) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < path.size(); i++) {
            if (i > 0) sb.append("->");
            sb.append(path.get(i));
        }
        return sb.toString();
    }
}
