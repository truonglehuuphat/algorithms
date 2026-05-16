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
    int max = 0;
    private int maxNode(TreeNode root){
        if(root == null) return 0;
        if(root.left == null && root.right == null) {
            return 1;
        }

        int left = maxNode(root.left);
        int right = maxNode(root.right);
        max = Math.max(max, left+right);
        return Math.max(left, right)+ 1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        maxNode(root);
        return max;
    }
}