class Solution {
public:
    vector<string> findRelativeRanks(vector<int>& score) {
        vector<int> ans;
        for(int n: score){
            ans.push_back(n);
        }
        sort(ans.begin(), ans.end());
        reverse(ans.begin(), ans.end());
        vector<string> res;
        for(int i = 0; i < score.size();i++){
            auto itfind = find(ans.begin(), ans.end(), score[i]);
            int dst = distance(ans.begin(), itfind);
            if(dst == 0){
                res.push_back("Gold Medal");
            } else if( dst == 1) {
                res.push_back("Silver Medal");
            } else if(dst == 2){
                res.push_back("Bronze Medal");
            } else {
                res.push_back(to_string(dst+1));
            }
        }
        return res;
    }
};