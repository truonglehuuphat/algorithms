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
    // int ans = Integer.MIN_VALUE;
    // int pre =-1;
    public int minDiff(TreeNode root, boolean isLeft){
        if(root == null) return 0;
        if(root.left==null && root.right==null && isLeft == true){  
            return root.val;
        }
        return minDiff(root.left, true) + minDiff(root.right, false);
    }
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null) return 0;
        return minDiff(root,false);
    }
}