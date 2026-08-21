class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        for(int i = 0 ; i < n; i++){
            int val_max = Integer.MIN_VALUE;
            for(int j = i+ 1; j < n;j++){
                if(arr[j] > val_max){
                    val_max = arr[j];
                }
            }
            if(i == n-1){
                ans[n-1] = -1;
            } else {
                ans[i] = val_max;
            }
        }
        return ans;
    }
}