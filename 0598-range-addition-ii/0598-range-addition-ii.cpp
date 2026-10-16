class Solution {
public:
    int maxCount(int m, int n, vector<vector<int>>& ops) {
        int a = m; int b = n;
        for(int i = 0; i < ops.size(); i++){
            int x = ops[i][0];
            int y = ops[i][1];
            a = min(a,x);
            b = min(b,y);
        }
        return a*b;
    }
};