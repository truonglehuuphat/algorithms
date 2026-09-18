class Solution {
    public String convertToTitle(int columnNumber) {
        String ans = "";
        int n = columnNumber; 
        while(n > 0 ){
            n--;
            int temp = n % 26;
            ans = (char)(temp +'A') + ans;
            n = n / 26;
        }
        return ans;
    }
}