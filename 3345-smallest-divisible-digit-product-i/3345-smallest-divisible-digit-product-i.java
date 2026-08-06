class Solution {
    private boolean isTrue(int n, int t){
        int product  = 1;
        while(n > 0){
            int temp = n % 10;
            product = product * temp;
            n= n /10;
        }
        return product % t == 0;
    }
    public int smallestNumber(int n, int t) {
        for(int i = n; i< n+ 11; i++){
            if(isTrue(i, t)){
                return i;
            }
        }
        return -1;
    }
}