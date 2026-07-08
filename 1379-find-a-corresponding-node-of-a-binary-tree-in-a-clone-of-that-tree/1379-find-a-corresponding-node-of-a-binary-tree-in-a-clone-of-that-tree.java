/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
       Deque<TreeNode> q_o = new ArrayDeque<>();
       Deque<TreeNode> q_c = new ArrayDeque<>();
       q_o.offer(original);
       q_c.offer(cloned);
       while(!q_o.isEmpty()){
        TreeNode node_o = q_o.poll();
        TreeNode node_c = q_c.poll();
        if(node_o == target){
            return node_c;
        }
        if(node_o.left != null){
            q_o.offer(node_o.left);
            q_c.offer(node_c.left);
        }
        if(node_o.right != null){
            q_o.offer(node_o.right);
            q_c.offer(node_c.right);
        }
       }
       return null;
    }
}