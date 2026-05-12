class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length - 1;
        double res = 0;
        double max = Long.MIN_VALUE;
        double sum = 0;
        for(int i = 0; i < k;i++ ){
            sum += nums[i];
        }
        res =(double) sum / k;
        max = max < res ? res: max;
        // System.out.println(max + " " + res + " "+ n);
        if(k <= n){
            for(int i = 0; i + k <= n; i++){
                // System.out.println(k+i + " " + i);
                sum = sum + nums[k+i] - nums[i];
                res = (double) sum / k;
                max = max < res ? res: max;
            }
        }
        return max;
    }
}