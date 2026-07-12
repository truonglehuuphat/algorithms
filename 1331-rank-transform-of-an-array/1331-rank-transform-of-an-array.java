class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] temp = arr.clone();
        int[] ans = new int[arr.length];
        Arrays.sort(temp);
        int index = 1;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(!map.containsKey(temp[i])){
                map.put(temp[i],index);
                index++;
            } 
        }
        for(int i= 0; i< n;i++){
            ans[i] = map.get(arr[i]);
        }
        return ans;
    }
}