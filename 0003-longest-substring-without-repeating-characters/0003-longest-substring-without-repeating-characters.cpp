class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        if(s == "") return 0;
        int max = INT_MIN;
        set<int> set;
        int r =0, l = 0;
        for(r= 0; r < s.length(); r++){
            char c = s[r];
            while(set.contains(c)) {
                set.erase(s[l]);
                l++;
            }
            set.insert(c);
            max = max < (r-l +1) ? (r-l+1) : max;
        }
        return max;
    }
};