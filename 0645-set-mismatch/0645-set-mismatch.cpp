class Solution {
public:
    vector<int> findErrorNums(vector<int>& nums) {
        int n = nums.size();
        int dup = 0, miss = 0;
        vector<int> v (n+1, 0);
        for(int i = 0  ; i < n; i++){
            v[nums[i]]++;
        }
        for(int i = 1; i < v.size(); i++){
            if(v[i] == 2) dup = i;
            if(v[i] == 0) miss = i;
        }
        return {dup, miss};
    }
};