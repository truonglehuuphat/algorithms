class NumArray {
public:
    vector<int> ans;
    NumArray(vector<int>& nums) {
        for(int i : nums){
            ans.push_back(i);
        }
    }
    
    int sumRange(int left, int right) {
        int result = 0;
        if(left < 0 || right > ans.size()) {
            return -1;
        }
        for(int i = left; i <= right; i++){
            result += ans[i];
        }
        return result;
    }
};

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray* obj = new NumArray(nums);
 * int param_1 = obj->sumRange(left,right);
 */