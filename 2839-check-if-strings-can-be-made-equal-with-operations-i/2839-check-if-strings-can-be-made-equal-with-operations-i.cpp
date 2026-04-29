class Solution {
public:
    bool canBeEqual(string s1, string s2) {
        string s_check1 = s1;
        string s_check2 = s2;       
        if(s1 == s2) return true;
        for(int i = 0 ; i < 2; i++){
            int j = i+2;
            swap(s_check1[i], s_check1[j]);
            for(int k = 0; k < 2 ; k++){
                int l = k + 2;
                swap(s_check2[k], s_check2[l]);
                if(s_check1 == s_check2) return true;
            }
        }
        return false;
    }
};