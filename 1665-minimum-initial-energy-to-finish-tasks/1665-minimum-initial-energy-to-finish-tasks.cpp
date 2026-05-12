class Solution {
public:
    int minimumEffort(vector<vector<int>>& tasks) {
        sort(tasks.begin(), tasks.end(),[&](vector<int>&a, vector<int>&b){
            return a[1] - a[0] < b[1] - b[0];
        });
        int ans = 0;
        for(auto p: tasks){
            ans = max(ans + p[0], p[1]);
        }
        return ans;
    }
};