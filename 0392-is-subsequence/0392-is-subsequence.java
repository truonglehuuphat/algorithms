class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] cS = s.toCharArray();
        char[] cT = t.toCharArray();
        int i =0, j = 0;
        int n = s.length(), m = t.length();
        while(i < n && j < m){
            // System.out.println(i + " " + j + " " + cS[i] + " " +  cT[i] + " " + n + " " + m);
            if(cS[i] == cT[j]){
                i++; j++;
            } else {
                j++;
            }
        }
        if(n == 0) return true;
        if(i < n && j == m - 1){
            return false;
        }
        else if(i == n  && j <= m) {
            return true;
        }
        System.out.println(i + " " + j);
        return false;
    }
}