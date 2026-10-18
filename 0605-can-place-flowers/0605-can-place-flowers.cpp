class Solution {
public:
    bool canPlaceFlowers(vector<int>& flowerbed, int n) {
        int res = 0;
        for(int i = 0; i < flowerbed.size(); i++){
            if(flowerbed[i] == 0){
                bool emptyleft = ( i== 0) || (flowerbed[i-1] == 0);
                bool emptyRight = ( i == flowerbed.size() - 1) || (flowerbed[i+1] == 0);
                if(emptyleft && emptyRight){
                    flowerbed[i] = 1;
                    res++;
                }
            }
        }
        
        return res >= n;
    }
};