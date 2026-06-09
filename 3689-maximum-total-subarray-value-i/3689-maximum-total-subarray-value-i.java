class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long maxValue = Integer.MIN_VALUE;
        long minValue = Integer.MAX_VALUE;
        for(int d : nums){
            if(maxValue < d ) maxValue = d;
            if(minValue > d) minValue = d;
        }
        long res = (maxValue - minValue) * k;
        return res;
    }
}