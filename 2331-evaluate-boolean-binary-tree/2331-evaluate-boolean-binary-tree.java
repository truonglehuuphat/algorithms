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
    private boolean res;
    // private bfs(TreeNode root){
    //     Queue<Integer> q = new LinkedList<>();
    //     q.offer(root.val);
    //     while(!q.isEmpty()){
    //         int p = q.poll();
    //         int size = q.size();
    //         if(p.left == null && p.right == null){

    //         }
    //     }
    // }
    public boolean evaluateTree(TreeNode root) {
        if(root == null) return res;

        if(root.left == null && root.right == null){
            return root.val == 0 ? false : true;
        }

        if(root.val == 2){
             return (evaluateTree(root.left)) || (evaluateTree(root.right));
        } else if(root.val == 3) {
            return (evaluateTree(root.left)) && (evaluateTree(root.right));
        }
        return res;
       
    }
}