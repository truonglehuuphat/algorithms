class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        int sum = 0;
        for(int[] d: accounts){
            sum = 0;
            for(int i : d){
                sum += i;
            }
            max = Math.max(max,sum);
        }
        return max;
    }
}