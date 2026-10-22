class Solution {
public:
    vector<vector<int>> imageSmoother(vector<vector<int>>& img) {
        int r[] = {-1,-1,-1,0,0,0,1,1,1};
        int l[] = {-1,0,1,-1,0,1,-1,0,1};
        int m = img.size();
        int n = img[0].size();
        vector<vector<int>> res(m, vector<int>(n, 0));
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                int sum = 0;
                int count = 0;
                for(int x = i - 1; x <= i+1; x++){
                    for(int y = j - 1; y <= j+1 ; y++){
                        if(0 <= x && x < m && 0<= y&& y< n){
                            sum += img[x][y];
                            count += 1;
                        }
                    }
                }
                res[i][j] = (int)sum/count;
            }
        }
        return res;
    }
};