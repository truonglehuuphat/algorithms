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
    int dfs(TreeNode * root, bool isLeft){
        if(!root) return 0;
        if(!root->left && !root->right && isLeft){
                return root->val;
        }
        return dfs(root->left, true) +   dfs(root->right, false);
    }

    int sumOfLeftLeaves(TreeNode* root) {
        return dfs(root,false);
    }
    // int sumOfLeftLeaves(TreeNode* root) {
    //     stack<pair<TreeNode*, bool>> st;
    //     st.push({root,false});
    //     int ans =0;
    //     while(!st.empty()){
    //         auto [cur, isLeft] = st.top(); st.pop();
    //         if(!cur->left && !cur->right && isLeft){
    //             ans+= cur->val;
    //         }
    //         if(cur->left){
    //             st.push({cur->left,true});
    //         }
    //         if(cur->right){
    //             st.push({cur->right,false});
    //         }
    //     }
    //     return ans;
    // }
};