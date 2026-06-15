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
    int postEnd = 0;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ;i < inorder.length; i++){
            map.put(inorder[i], i);
        }
        postEnd = inorder.length - 1;
        return solve(map, 0, inorder.length - 1, postorder);
    }
    private TreeNode solve( Map<Integer, Integer> map, int inStart, int inEnd, int[] postOrder){
        if(inStart > inEnd || postEnd < 0 ) return null;
        int val = postOrder[postEnd--];
        TreeNode root = new TreeNode(val);
        int IndexInOrder = map.get(val);
        root.right = solve(map, IndexInOrder+1, inEnd, postOrder);
        root.left = solve(map, inStart, IndexInOrder-1, postOrder);

        return root;
    }
}