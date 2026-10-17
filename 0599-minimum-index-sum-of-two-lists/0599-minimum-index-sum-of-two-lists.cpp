class Solution {
public:
    vector<string> findRestaurant(vector<string>& list1, vector<string>& list2) {
        unordered_map<string,int> map;
        int i =0;
        int min_value = INT_MAX ;
        for(string str: list1){
            auto itfind = find(list2.begin(), list2.end(), str);
            int sum = i;
            if(itfind != list2.end()){
                sum += (itfind - list2.begin());
                map[str] = sum;
                min_value = min_value > sum ? sum: min_value;
            }
            i++;
        }
        vector<string> res;
        for(auto p: map){
            if(p.second == min_value){
                res.push_back(p.first);
            }
        }
        return res;
    }
};