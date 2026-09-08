class Solution {
    public int countCommas(int n) {
        int len = 0;
        int temp = n;
        while(temp > 0){
            len++;
            temp = temp / 10;
        }
        if(len < 3) return 0;
        int res = 0;
        for(int i = 1000;i <= n;i++){
            res++;
        }
        return res;
    }
}