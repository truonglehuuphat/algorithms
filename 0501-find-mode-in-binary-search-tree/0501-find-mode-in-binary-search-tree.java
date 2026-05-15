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
    Map<Integer,Integer> map; 
    int max = Integer.MIN_VALUE;
    public void Mode(TreeNode root){
        if(root != null){
            map.put(root.val, map.getOrDefault(root.val, 0)+1);
            max = map.get(root.val) > max ? map.get(root.val) : max;
            Mode(root.left);
            Mode(root.right);
        }
    }
    public int[] findMode(TreeNode root) {
        map = new HashMap<>();
        Mode(root);
        List<Integer> res = new ArrayList<>();
        // List<Integer> maxFre = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            if(value >= max){
                res.add(key);
            }
            // maxFre.add(key);
        }
        // return res.size() != 0 ? res.stream().mapToInt(Integer::intValue).toArray(): res1.stream().mapToInt(Integer::intValue).toArray();
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}