class Solution {
    public int findMin(int[] nums) {
        // int left = num[0];
        Arrays.sort(nums);
        return nums[0];
    }
}