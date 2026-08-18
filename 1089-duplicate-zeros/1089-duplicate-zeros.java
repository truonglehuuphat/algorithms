class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        for(int i = 0;i < n - 1;i++){
            if(arr[i] == 0){
                int resIndex = n-1;
                while(resIndex > i + 1){
                    arr[resIndex] = arr[resIndex-1];
                    resIndex--;
                }
                arr[resIndex] = 0;
                i++;
            } 
        }
    }
}