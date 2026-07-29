class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums;
        int i = 0;
        int j = n - 1;
        int i_ans = 0;
        int j_ans = n - 1;
        int[] ans = new int[n];
        while(i < n){
            if(nums[i] % 2 == 0){
                ans[i_ans] = nums[i];
                i_ans++;
            } else {
                ans[j_ans] = nums[i];
                j_ans--;
            }

            // if(nums[j] % 2 != 0){
            //     ans[j_ans] = nums[j];
            //     j_ans--;
            // } else {
            //     ans[i_ans] = nums[j];
            //     i_ans++;
            // }
            i++;
            // j--;
        }
        return ans;
    }
}