class Solution {
    public int GCD(int a, int b){
        for(int i = Math.min(a,b); i > 0; i--){
            if(a % i == 0 && b % i == 0)
                return i;
        }
        return 0;
    }

    public int gcdOfOddEvenSums(int n) {
        int sumOdd  = 0;
        int sumEven = 0;
        for(int i = 0 ; i <= n * 2; i++){
            if(i % 2 == 0){
                 sumOdd = sumOdd + i;
            } else {
                sumEven = sumEven + i;
            }
        }
        // System.out.println(sumOdd + " "+ sumEven);
        return GCD(sumOdd, sumEven);
    }
}