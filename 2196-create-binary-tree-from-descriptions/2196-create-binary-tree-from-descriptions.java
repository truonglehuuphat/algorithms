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
    private TreeNode dfs(Map<Integer, List<int[]>> map, int val){
        TreeNode node = new TreeNode(val);
        if(map.containsKey(val)){
            for(int [] childInfo: map.get(val)){
                int child = childInfo[0];
                int isleft = childInfo[1];
                if(isleft == 1){
                    node.left = dfs(map,child);
                } else {
                    node.right = dfs(map,child);
                }
            }
        }
        return node;
    }
    public TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer, List<int[]>> map = new HashMap<>();
        Set<Integer> allnodes = new HashSet<>();
        Set<Integer> children = new HashSet<>();
        for(int[] d : descriptions){
            int parent = d[0];
            int child = d[1];
            int isLeft = d[2];
            if(!map.containsKey(parent)){
                map.put(parent, new ArrayList<>());
            }
            map.get(parent).add(new int[]{child, isLeft});
            allnodes.add(parent);
            allnodes.add(child);
            children.add(child);
        }
        int rootVal = 0;
        for(int node : allnodes){
            if(!children.contains(node)){
                rootVal = node;
                break;
            }
        }
        return dfs(map, rootVal);
    }
}