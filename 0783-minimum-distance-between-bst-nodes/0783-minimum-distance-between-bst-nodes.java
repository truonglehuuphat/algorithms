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
    int preVal = Integer.MAX_VALUE;
    List<Integer> ans = new LinkedList<>();
    public int minDiffInBST(TreeNode root) {
        if(root == null) return 0;
        ans.add(root.val);
        if(root.left != null) minDiffInBST(root.left);
        if(root.right !=null) minDiffInBST(root.right);
        Collections.sort(ans);
        for(int i = 0 ; i < ans.size() -1 ;i++){
            preVal = Math.min(preVal, Math.abs(ans.get(i) - ans.get(i+1)));
        }
        return preVal;
    }
}