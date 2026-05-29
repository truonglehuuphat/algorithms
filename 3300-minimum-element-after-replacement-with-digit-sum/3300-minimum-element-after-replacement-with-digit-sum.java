class Solution {
    private int sumDigits(int n){
        int res = 0;
        while(n > 0) {
            int temp = n % 10;
            res += temp;
            n = n /10;
        }
        return res;
    }

    public int minElement(int[] nums) {
        int res = Integer.MAX_VALUE;
        for(int i = 0 ; i < nums.length; i++) {
            int temp = sumDigits(nums[i]);
            res = temp < res ? temp : res;
        }
        return res;
    }
}