class Solution {
    public int mySqrt(int x) {
        if(x == 0 ) return 0;
        if(x <= 2 ) return 1;
        long left = 1; 
        long right = x/2;
        long mid = 0;
        int ans = 0;
        while(left <= right){
            mid = left + (right - left) /2;
            if(mid*mid == x) {
                return (int)mid;
            }
            else if(mid*mid < x){
                ans =(int) mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
}