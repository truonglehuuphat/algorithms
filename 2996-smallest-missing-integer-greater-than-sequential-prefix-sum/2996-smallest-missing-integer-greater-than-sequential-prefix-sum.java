class Solution {
    public int missingInteger(int[] nums) {
        int sum = 0;
        Set<Integer> ans = new HashSet<>();
        for(int i: nums){
            ans.add(i);
        }
        sum = nums[0];
        for(int i = 1; i < nums.length ; i++){
            if(nums[i] == nums[i-1] + 1){
                sum += nums[i];
            } else {
                break;
            }
        }
        while(ans.contains(sum)){
            sum++;
        }

        return sum;
    }
}