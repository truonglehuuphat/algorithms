class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> lessNum = new ArrayList<>();
        List<Integer> greaterNum = new ArrayList<>();
        for(int d: nums){
            if(d < pivot){
                lessNum.add(d);
            }
            if (d > pivot) {
                greaterNum.add(d);
            }
        }
        for(int d: nums){
            if(d == pivot){
                lessNum.add(d);
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int d : lessNum){
            ans.add(d);
        }
        for(int d: greaterNum){
            ans.add(d);
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}