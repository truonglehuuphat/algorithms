class Solution {
public:
    int findMinDifference(vector<string>& timePoints) {
        vector<int> minutes;
        for(string s: timePoints){
            int hour = s[0] *10 + s[1];
            int min = s[3]*10 + s[4];
            int totalMin = hour*60 + min;
            minutes.push_back(totalMin);
        }
        int res = 10000;
        for(int i = 0; i < timePoints.size()-1; i++){
            for(int j = i + 1; j < timePoints.size(); j++){
                int diff = min( abs(minutes[i]- minutes[j]), 24*60-abs(minutes[i]- minutes[j]));
                if(diff < res){
                    res = diff;
                }
            }
        }
        return res;
    }
};