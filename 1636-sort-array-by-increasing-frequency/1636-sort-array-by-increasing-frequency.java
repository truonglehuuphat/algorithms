class Solution {
    public int[] frequencySort(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        Map<Integer, Integer> sortedMap = map.entrySet()
        .stream()
        .sorted((e1,e2)->{
            int cmp = e2.getValue().compareTo(e1.getValue());
            if(cmp == 0){
                return e1.getKey().compareTo(e2.getKey());
            }
            return cmp;
        })
        .collect(Collectors.toMap(
            Map.Entry::getKey,
            Map.Entry::getValue,
            (oldValue, newValue) -> oldValue, // Merge function (not used here)
            LinkedHashMap::new // Preserve order
        ));
        int i = 0;
        for(Map.Entry<Integer,Integer> entry: sortedMap.entrySet()){
            for(int j = 0 ; j < entry.getValue(); j++){
                ans[i++] = entry.getKey();
            }
        }
        for(int k = 0, l = n - 1; k < l; k++, l--){
            int temp = ans[k];
            ans[k] = ans[l];
            ans[l] = temp;
        }
        return ans;
    }
}