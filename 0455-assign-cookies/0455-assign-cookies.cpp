class Solution {
public:
    int findContentChildren(vector<int>& g, vector<int>& s) {
     sort(g.begin(), g.end());
     sort(s.begin(), s.end());
     int index =0;
     int res = 0;
     while(index < s.size() && res < g.size() ){
        if(s[index] >= g[res]){
            res++;
        }
        index++;
     }
     return res;
    }
};