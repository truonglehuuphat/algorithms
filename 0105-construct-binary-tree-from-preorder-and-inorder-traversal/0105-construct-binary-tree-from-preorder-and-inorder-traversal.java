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
    private int index = 0;
    private TreeNode resolve(int[] preorder, int start, int end, HashMap<Integer, Integer>map){
        if(start > end ) return null;
        int val = 0;
        // if(index < preorder.length){
            val = preorder[index++];
        // }
        
        TreeNode root = new TreeNode(val);
        int indexInorder= map.get(val);
        root.left = resolve(preorder,start, indexInorder-1, map);
        root.right = resolve(preorder,indexInorder+1, end, map);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < inorder.length;i++){
            map.put(inorder[i], i);
        }
        return resolve(preorder, 0, inorder.length - 1, map);
    }

}