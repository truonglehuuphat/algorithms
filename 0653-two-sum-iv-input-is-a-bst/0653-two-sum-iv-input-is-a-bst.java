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
    public boolean findTarget(TreeNode root, int k) {
        if(root == null) return false;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int sum = 0;
        List<Integer> arr = new ArrayList<>();
        while(!q.isEmpty()){
            TreeNode cur = q.poll();
            arr.add(cur.val);
            if(cur.left != null) q.add(cur.left);
            if(cur.right != null) q.add(cur.right);
        }
        Collections.sort(arr);
        int left = 0; 
        int right = arr.size() - 1;
        while(left < right){
            int mid = arr.get(left) + arr.get(right);
            if(mid == k){
                return true;
            } else if(mid > k) {
                right--;
            } else {
                left++;
            }
        }
        return false;
    }
}