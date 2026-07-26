class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;
        int sum = 0;
        for(int i: nums){
            if(i == 1){
                sum++;
            } else {
                sum = 0;
            }
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}