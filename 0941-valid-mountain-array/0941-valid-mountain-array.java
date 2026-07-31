class Solution {
    public boolean validMountainArray(int[] arr) {
        int flagInc = 0;
        int flagDes = 0;
        int n = arr.length;
        if(n >=3){
            if(arr[0] < arr[1]) flagInc = 1;
            else return false;

            for(int i = 0; i < n - 1; i++){
                if(arr[i] < arr[i+1] && flagInc != 1){
                    flagInc--;
                }                
                if(arr[i] > arr[i+1] && flagInc == 1){
                    flagInc--;
                }
                if(arr[i] == arr[i+1]) return false;

            }
            if(flagInc == 0) return true;
        }
        return false;
    }
}