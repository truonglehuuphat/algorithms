class Solution {
    public int titleToNumber(String columnTitle) {
        long  ans =0;
        for(int i = 0; i < columnTitle.length() ;i++){
            int c = columnTitle.charAt(i) - 'A' + 1;
            ans = (26*ans) + c;
        }
        return (int) ans;
    }
}