class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> lessNum = new ArrayList<>();
        List<Integer> greaterNum = new ArrayList<>();
        List<Integer> equalNum = new ArrayList<>();
        for(int d: nums){
            if(d < pivot){
                lessNum.add(d);
            }
            else if (d > pivot) {
                greaterNum.add(d);
            } else {
                equalNum.add(d);
            }
        }
        lessNum.addAll(equalNum);
        lessNum.addAll(greaterNum);
        // List<Integer> ans = new ArrayList<>();
        return lessNum.stream().mapToInt(Integer::intValue).toArray();
    }
}