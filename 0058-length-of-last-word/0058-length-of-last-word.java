class Solution {
    public int lengthOfLastWord(String s) {
        int res = 0;
        int ans = 0;
        for(int i = 0;i < s.length(); i++){
            if(s.charAt(i) != ' '){
                res++;
            } else  {
                ans = res > 0 ? res: ans;
                res = 0;
            }
        }
        ans = res > 0 ? res: ans;
        return ans;
    }
}