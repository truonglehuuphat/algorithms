class Solution {
public:
    bool isGood(vector<int>& nums) {
        int n = nums.size();
        sort(nums.begin(), nums.end());
        int sizeByMaxValue = nums[n-1] + 1;
        // cout << sizeByMaxValue << " " << n << endl;
        if(sizeByMaxValue == n ){
            // tim kiem dieu kien false
            // mang moi cua so max la [1,2,3,3]
            // mang cu la  [1,3,3,2] => sort => [1,2,3,3] bang voi mang moi
            // tao mang moi
            vector<int> newArray;
            for(int i = 1; i <= nums[n-1] ;i++){
                newArray.push_back(i);
            }
            newArray.push_back(nums[n-1]);

            for(int i = 0 ; i < n;i++){
                if(nums[i] != newArray[i]){
                    return false;
                }
            }

            return true;
        }
        return false;
    }
};