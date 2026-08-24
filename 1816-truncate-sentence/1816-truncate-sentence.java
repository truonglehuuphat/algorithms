class Solution {
    public String truncateSentence(String s, int k) {
        String[] ans = s.split(" ");
        String res = "";
        for(int i = 0; i < k ; i++){
            res += ans[i] + " ";
        }
        return res.trim();
    }
}