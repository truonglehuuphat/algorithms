class Solution {
public:
    string shortestCompletingWord(string licensePlate, vector<string>& words) {
     int license[26] = {};
     string ans = "";
     for(auto c: licensePlate){
        int t = tolower(c) - 'a';
        if(t >= 0 && t< 26){license[t]++;}
     }
     for(auto w: words){
        int testString[26] = {}, flag = 1;
        for(auto c: w) testString[c -'a']++;
        for(int i = 0 ; i < 26; ++i){
            if(license[i] > testString[i]) flag =0;
        }
        if(flag && (ans.size()==0 || ans.size() > w.size())) ans = w;
     
     }
     return ans;
    }
};