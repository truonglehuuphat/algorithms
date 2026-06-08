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
    TreeNode res = new TreeNode(0);
    TreeNode ans = new TreeNode(0);
    private TreeNode TreeNodeRight(TreeNode root){
        if(root == null) return null;
        ans.val = root.val;
        ans.right = TreeNodeRight(root.left);
        ans.right = TreeNodeRight(root.right);
        return ans;
    }TreeNode temp = null;
    public void flatten(TreeNode root) {
        if(root == null) return;
        flatten(root.right);
        flatten(root.left);
        // TreeNode temp = root.left;
        root.right = temp;
        root.left = null;
        temp = root;
    }
}