/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        if(root==null) return new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            Node temp = st.pop();
            res.add(temp.val);
            for( int idx = temp.children.size() - 1 ; idx >= 0 ; idx--){
                Node child = temp.children.get(idx);
                st.push(child);
            }
        }
        return res;
    }
}