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
    TreeNode firstNode;
    TreeNode secondNode;
    TreeNode preNode;
    public void recoverTree(TreeNode root) {
        inOrderTra(root);
        int temp = firstNode.val;
        firstNode.val = secondNode.val;
        secondNode.val = temp;
    }

    private void inOrderTra(TreeNode root){
        if(root == null) return;
        inOrderTra(root.left);
        if(preNode != null && preNode.val > root.val){
            if(firstNode ==null){
                firstNode = preNode;
            } 
            secondNode = root;  
        }
        preNode = root;
        inOrderTra(root.right);
    }
}