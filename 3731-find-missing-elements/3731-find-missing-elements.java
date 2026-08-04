class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> res = new ArrayList<>();

        int[] ans = new int[101];

        for(int i: nums){
            ans[i]++;
        }

        int minx = Arrays.stream(nums).min().getAsInt();
        int maxx = Arrays.stream(nums).max().getAsInt();

        for(int i = minx; i<= maxx;i++){
            if(ans[i] == 0){
                res.add(i);
            }
        }
        return res;
    }
}