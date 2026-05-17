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
    private int totaltilt = 0;
    private int sumTilt(TreeNode root){
        if(root == null) return 0;
        int left = sumTilt(root.left);
        int right = sumTilt(root.right);
        this.totaltilt += Math.abs(left - right);
        return root.val + left + right;
    }

    public int findTilt(TreeNode root) {
        this.totaltilt = 0;
        this.sumTilt(root);
        return this.totaltilt;
    }
}