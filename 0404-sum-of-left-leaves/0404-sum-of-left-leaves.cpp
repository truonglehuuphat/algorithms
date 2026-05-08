/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    
    int sumOfLeftLeaves(TreeNode* root) {
        stack<pair<TreeNode*, bool>> st;
        st.push({root,false});
        int ans =0;
        while(!st.empty()){
            auto [cur, isLeft] = st.top(); st.pop();
            if(!cur->left && !cur->right && isLeft){
                ans+= cur->val;
            }
            if(cur->left){
                st.push({cur->left,true});
            }
            if(cur->right){
                st.push({cur->right,false});
            }
        }
        return ans;
    }
};