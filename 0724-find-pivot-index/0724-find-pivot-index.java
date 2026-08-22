class Solution {
    public int pivotIndex(int[] nums) {
        int sumLeft = 0;
        int total=0;
        for(int i : nums){
            total += i;
        }
        for(int i = 0; i < nums.length; sumLeft += nums[i++]){
            if(sumLeft * 2 == total - nums[i]){
                return i;
            }
        }
        return -1;
    }
}