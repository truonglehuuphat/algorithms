class Solution {

    private int indexArray(int[] nums, int val){
        int index = 0;
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] < val){
                left = mid + 1;
            } else if(nums[mid] > val){
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    public boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] > nums[(i+1) % n]){
                count++;
            }
            if(count > 1) return false;
        }
        return true;
    }
}