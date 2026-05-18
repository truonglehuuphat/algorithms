class Solution {
    public int[] sortedSquares(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for(int i : nums){
            res.add(i*i);
        }
        Collections.sort(res);
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}