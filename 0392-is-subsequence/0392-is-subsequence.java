class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] cS = s.toCharArray();
        char[] cT = t.toCharArray();
        int i =0, j = 0;
        int n = s.length(), m = t.length();
        while(i < n && j < m){
            if(cS[i] == cT[j]){
                i++;
            } 
            j++;
        }
        
        return i == n;
    }
}