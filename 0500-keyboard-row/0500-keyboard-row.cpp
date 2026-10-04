class Solution {
public:
    vector<string> findWords(vector<string>& words) {
        unordered_map<char,int> ans;
        string one = "qwertyuiopQWERTYUIOP";
        string two = "asdfghjklASDFGHJKL";
        string three = "zxcvbnmZXCVBNM";
        for(char& ch: one) ans[ch] = 1;
        for(char& ch: two) ans[ch] = 2;
        for(char& ch: three) ans[ch] = 3;
        vector<string> res;
        for(string str: words){
            int ind = ans[str[0]];
            bool flag = true;
            for(char &ch:str){
                if(ans[ch]!=ind){
                    flag = false;
                    break;
                }
            }
            if(flag) res.push_back(str);
        }
        return res;
    }
};