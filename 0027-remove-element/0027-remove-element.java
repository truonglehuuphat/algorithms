class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.sort(nums);
        int index = 0;
        for(int i : nums){
            if(i != val){
               ans[index++] = i;
            } else {
                n--;
            }
        }
        
        for(int i = 0 ;i < n; i++){
            nums[i] = ans[i];
        }
        return n;
    }
}