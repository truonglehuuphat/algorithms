class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] temp = nums.clone();
        Arrays.sort(temp);
        int n = nums.length;
        int[] ans = new int[n];
        for(int i = 0 ; i < n ;i++){
            for(int j = 0; j < n; j++){
                if(temp[j] == nums[i]){
                    ans[i] = j;
                    break;
                }
            }
        }
        return ans;
    }
}