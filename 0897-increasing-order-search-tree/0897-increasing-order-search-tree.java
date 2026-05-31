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
    private void traverseBTS(TreeNode root, List<Integer> lst){
        if(root == null) return;
        traverseBTS(root.left, lst);
        lst.add(root.val);
        traverseBTS(root.right, lst);
    }
    private TreeNode AddBTS(TreeNode root, int val){
        if(root == null) return new TreeNode(val);
        else if(root.val > val){
           root.left = AddBTS(root.left, val);
        } else {
           root.right = AddBTS(root.right, val);
        }
        return root;
    }
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        traverseBTS(root, ans);
        // Collections.sort(ans);
        TreeNode res = new TreeNode(ans.get(0));
        for(int i = 1; i < ans.size() ;i++){
            res = AddBTS(res, ans.get(i));
        }
        return res;
    }
}