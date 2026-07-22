class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        if(n <= 1) return 0;
        int i = 0;
        int j = n-1;
        int are = 0;
        while(i < j ){
            int minK = Math.min(height[i], height[j]);
            int bottomK= j-i;
            are = Math.max(are,minK * bottomK);
            if(height[i] > height[j]){
                j--;
            }
            else if(height[i] <= height[j]){
                i++;
            }
            
        }
        return are;
    }
}