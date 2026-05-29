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
    private long minFirst = Integer.MAX_VALUE;
    private long minSec = -1;
    private void travser(TreeNode root){
        if(root == null) return;
        minFirst = minFirst > root.val ? root.val: minFirst;
        if(minSec == -1) {
            minSec = minFirst;
        }
        if(minSec == minFirst && root.val > minSec || minSec > root.val && root.val != minFirst){
            minSec = root.val;
        }
        travser(root.left);
        travser(root.right);
    }

    public int findSecondMinimumValue(TreeNode root) {
        if(root == null ) return 0;
        travser(root);
        return (int) (minSec == minFirst ? -1 : minSec);
    }
}