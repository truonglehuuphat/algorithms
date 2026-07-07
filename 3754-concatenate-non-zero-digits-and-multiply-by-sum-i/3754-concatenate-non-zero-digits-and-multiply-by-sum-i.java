class Solution {
    public long sumAndMultiply(int n) {
        long x = 0;
        long sum = 0;
        long res = 0;
        int power = 0;
        while(n>0){
            int temp = n % 10;
            sum = sum + temp;
            if(temp != 0){
                // System.out.println(temp + " "+ x);
                x = (long)(temp * Math.pow(10, power)) + x;
                power++;
            }
            n = n /10;
        }
        // System.out.println(x + " "+ sum);
        return x*sum;
    }
}