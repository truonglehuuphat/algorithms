/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leafValue1 = new ArrayList<>();
        List<Integer> leafValue2 = new ArrayList<>();
        dfs(root1, leafValue1);
        dfs(root2, leafValue2);
        return leafValue1.equals(leafValue2);
    }

    void dfs(TreeNode root, List<Integer> leafValue){
        if(root != null){
            if(root.left == null && root.right == null){
                leafValue.add(root.val);
            }
            dfs(root.left,leafValue);
            dfs(root.right,leafValue);
        }
    }
}