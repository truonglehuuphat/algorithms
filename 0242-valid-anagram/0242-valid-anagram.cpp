class Solution {
public:
    bool isAnagram(string s, string t) {
        int slength = s.length();
        int tlength = t.length();
        if(slength != tlength){
            return false;
        }
        vector<int> ans(26,0);
        for(char c: s){
            ans[c-'a']++;
        }
        for(char c: t){
            if(ans[c-'a'] ==0){
                return false;
            }
            ans[c-'a']--;
        }
        return true;
    }
};