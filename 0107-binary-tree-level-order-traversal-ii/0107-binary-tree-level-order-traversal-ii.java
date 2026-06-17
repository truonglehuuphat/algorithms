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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size()- 1;
            List<Integer> ans = new ArrayList<>();
            for(int i = size; i >=0 ;i--){
                TreeNode cur = q.poll();
                ans.add(cur.val);
                if(cur.right != null) q.offer(cur.right);
                if(cur.left != null) q.offer(cur.left);
            }
            Collections.reverse(ans);
            res.add(ans);
        }

        Collections.reverse(res);
        return res;
    }
}