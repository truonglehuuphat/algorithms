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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer> ans = new ArrayList<>();
            int size = q.size();
            // System.out.println( "24  "+q.size());
            for(int i = 0; i < size; i++){
                TreeNode cur = q.poll();
                //  System.out.println( "27  "+ cur.val);
                ans.add(cur.val);
                if(cur.left != null) {q.offer(cur.left);}
                if(cur.right != null) {q.offer(cur.right);}
                
            }
            // System.out.println("31 "+ q.size());
            res.add(ans);
        }
        return res;
    }
}