class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder ans = new StringBuilder();
        int n = columnNumber; 
        while(n > 0 ){
            n--;
            ans.append((char)(((n) % 26) + 'A'));
            n = n / 26;
        }
        return ans.reverse().toString();
    }
}