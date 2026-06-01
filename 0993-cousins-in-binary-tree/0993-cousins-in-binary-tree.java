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
    // List<Pair<Integer,Integer>> ans = new ArrayList<>(); 
    // private TreeNode deepth(TreeNode root, int x){
    //     Stack<Pair<TreeNode, Integer>> st = new Stack<>();
    //     st.push(new Pair<>(root, 0));
    //     // int res = 0;
    //     int k = 0;
    //     int flag = 0;
    //     TreeNode res = new TreeNode();
    //     while(!st.isEmpty()){
    //         Pair<TreeNode, Integer> p = st.pop();
    //         k = p.getValue();
    //         TreeNode p1 = p.getKey();
    //         // ans.add(new Pair<>(p1.val,k));
    //         if(p1.val == x){
    //             res = p1;
    //         }
    //         if(p1.left != null ) {
    //             st.push(new Pair<>(p1.left, k+1));
    //         }
    //         if(p1.right != null){
    //             st.push(new Pair<>(p1.right, k+1));
    //         }
    //     }
    //     return res;
    // }

    // private int heightNode(TreeNode root){
    //     if(root == null) {
    //         return 0;
    //     }
    //     else {
    //         System.out.println(root.val);
    //         if(root.left == null && root.right == null ){
    //             return 1;
    //         }
    //         int left = heightNode(root.left)+1;
    //         int right = heightNode(root.right)+1;
    //         return Math.max(left,right);
    //     }
    // }

    // private TreeNode deepth(TreeNode root, int x){
    //     if(root == null) {
    //         return null;
    //     }
    //     else {
    //         if(root.val == x) {
    //             return root;
    //         } else {
    //             deepth(root.left, x);
    //             deepth(root.right, x);
    //             // return null;
    //         }
    //     }
    //     return root;
    // }

    public boolean isCousins(TreeNode root, int x, int y) {
        if(root == null) return false;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            boolean isAexist = false; boolean isBexist = false;
            for(int i = 0; i < size;i++){
                TreeNode cur = q.poll();
                if(cur.val == x ) isAexist = true;
                if(cur.val == y ) isBexist = true;
                if(cur.left != null && cur.right != null){
                    if(cur.left.val == x && cur.right.val == y){
                        return false;
                    }
                    if(cur.left.val == y && cur.right.val == x){
                        return false;
                    }
                }
                if(cur.left != null) q.offer(cur.left);
                if(cur.right != null) q.offer(cur.right);
            }
            if(isAexist && isBexist) {
                return true;
            }
        }
        return false;
    }
}