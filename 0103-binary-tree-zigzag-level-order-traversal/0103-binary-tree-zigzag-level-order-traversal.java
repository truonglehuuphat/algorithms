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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        boolean inDirLeftToRight = true;
        if(root == null ) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> ans = new ArrayList<>();

            for(int i = 0; i < size ;i++){
                TreeNode cur = q.poll();
                ans.add(cur.val);
                // System.out.println(cur.val + " " + inDirLeftToRight);
                // if(inDirLeftToRight == true){
                    // if(cur.right != null) q.offer(cur.right);        
                    // if(cur.left != null) q.offer(cur.left);
                // } else {
                    if(cur.left != null) q.offer(cur.left);
                    if(cur.right != null) q.offer(cur.right);
                // }
            }
            for(int d : ans ){
                System.out.print(d + " ");
            }
            System.out.println(inDirLeftToRight);

            if(inDirLeftToRight == true ) {
            //     // Collections.sort(ans);
                // Collections.reverse(ans);
            } else {
                // Collections.sort(ans, Collections.reverseOrder());
                Collections.reverse(ans);
            }
            inDirLeftToRight = inDirLeftToRight == true ? false : true;
            res.add(ans);
        }
        return res;
    }
}