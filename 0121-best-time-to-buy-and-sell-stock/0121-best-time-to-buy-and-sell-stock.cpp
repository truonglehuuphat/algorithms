class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int ans = 0;
        int minValue = INT_MAX ;
        for(int n: prices){
            if(minValue > n){
                minValue = n;
            } else {
                ans = ans > n - minValue ? ans : n - minValue; 
            }
        }
        return ans;
    }
};