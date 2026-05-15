class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        
        for(Object i : map.keySet()){ 
            // System.out.println(i + " " +map.get(i) );
            if(map.get(i) >= 2) {
                return true;
            }
        }
        return false;
    }
}