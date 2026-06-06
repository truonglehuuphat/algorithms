class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = 0;
        for(int i = 0; i < n; i++){
            if( i == 0) {
                left[0] = 0;
            } else {
                int temp = i - 1; 
                int sum = 0;
                while( temp >= 0){
                    sum += nums[temp];
                    temp--;
                }
                left[i] = sum;
            }
            
        }
        right[n-1] = 0;
        for(int i = n - 1; i >=0 ; i--){
            int sum = 0;
            if (i == n - 1 ) {
                right[i] = 0;
            } else {
                int temp = i+1;
                while(temp < n){
                    sum += nums[temp];
                    temp++;
                }
                right[i] = sum;
            }

        }
        // for(int d : left){
        //     System.out.print(d + " ");
        // }
        // System.out.println();
        // for(int d : right){
        //     System.out.print(d + " ");
        // }
        System.out.println();
        int[] ans = new int[n];
        for(int i = 0; i < n ; i++){
            ans[i] = Math.abs(left[i] - right[i]);
        }
        return ans;
    }
}