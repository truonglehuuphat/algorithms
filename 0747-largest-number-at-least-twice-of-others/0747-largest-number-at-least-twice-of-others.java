class Solution {
    public int dominantIndex(int[] nums) {
        int[] max = new int[2];
        max[0] = Integer.MIN_VALUE;
        for(int i = 0 ;i < nums.length; i++){
            if(nums[i] > max[0]){
                max[0] = nums[i];
                max[1] = i;
            }
        }
        System.out.println(max[0] + " " + max[1]);
        for(int i = 0 ; i< nums.length; i++){
            if(nums[i] != 0 && nums[i] != max[0] && max[0] % nums[i] != 0 && max[0] / nums[i] < 2){
                return -1;
            }
        }
        return max[1];
    }
}