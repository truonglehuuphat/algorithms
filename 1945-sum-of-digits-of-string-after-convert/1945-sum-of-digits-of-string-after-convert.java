class Solution {
    private int sumDigits(int n){
        int res = 0;
        while(n>0){
            res += n % 10;
            n = n /10;
        }
        return res;
    }
    public int getLucky(String s, int k) {
        int sum = 0;

        for(char c : s.toCharArray()){
            int temp = c - 'a' + 1;
            if(temp > 9){
                sum += sumDigits(temp);
            } else {
                sum += temp;
            }
        }
        if(k == 1) return sum;
        int res = 0;
        // System.out.println(sum);
        for( int i = 1 ; i < k; i++){
            res = sumDigits(sum);
            sum = res;
        }
        return res == 0 ? sum : res;
    }
}