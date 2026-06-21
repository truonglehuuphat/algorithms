class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count = 0;
        for(int d: costs){
            if(coins >= d){
                count++;
                coins = coins - d;
            }
        }
        return count;
    }
}