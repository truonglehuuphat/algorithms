class Solution {
public:
    int findLengthOfLCIS(vector<int>& nums) {
        int res = 0;
        int count = 0;
        for(int i = 0; i < nums.size(); i++){
            if(i > 0 && nums[i - 1] >= nums[i]){
                count = i;
            } 
            res = res < i - count + 1? i - count + 1: res;
        }
        return res;
    }
};