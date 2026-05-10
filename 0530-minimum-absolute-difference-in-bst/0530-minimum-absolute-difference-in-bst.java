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
    int pre = -1;
    int ans = Integer.MAX_VALUE;
    public void miniDiff(TreeNode root){
        if(root == null) return;
        miniDiff(root.left);
        if(pre != -1){
            ans = Math.min(ans, Math.abs(pre - root.val));
        }
        pre = root.val;
        miniDiff(root.right);
    }
    public int getMinimumDifference(TreeNode root) {
        if(root== null) return 0;
        miniDiff(root);
        return ans;
    }
}