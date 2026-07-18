class Solution {
    private int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int minValue = nums[0];
        int maxValue = nums[n-1];
        return gcd(minValue, maxValue);
    }
}