class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0, j = 0;
        while(i < nums.length && j < nums.length){
            while(i < nums.length && nums[i] != 0){
                i++;
            }
            j = i+1;
            while(j < nums.length && nums[j] == 0){
                j++;
                if(j == nums.length) {
                    break;
                }
            }
            if(j < nums.length && nums[j] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            i++;
        }
    }
    
}