class Solution {
public:
    int distributeCandies(vector<int>& candyType) {
        int n = candyType.size();
        int res = 0;
        unordered_map<int,int> map;
        for(int i = 0; i < n; i++){
            if(map.find(candyType[i]) == map.end()){
                res++;
            } 
                map[candyType[i]] = 1;
        }
        if (res > n/2) return n/2;
        return res;
    }
};