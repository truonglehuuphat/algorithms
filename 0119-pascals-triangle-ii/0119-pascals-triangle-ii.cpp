class Solution {
public:
    vector<int> getRow(int rowIndex) {
        long e =1;
        vector<int> ans; 
        ans.push_back(e);
        for(int i = 0; i < rowIndex; i++){
            e = e * (rowIndex-i);
            e = e / (i+1);
            ans.push_back((int)e);
        }
        return ans;
    }
};