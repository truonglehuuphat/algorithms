class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        int[] ans = new int[100001];
        for(int i = 0; i < nums.length; i++){
            ans[nums[i]]++;
            // System.out.println(nums[i] + " " + ans[nums[i]]);
        }
        List<Integer> res = new ArrayList<>();
        for(int i = 1 ; i < n+1; i++){
            if(ans[i] == 0) {
                res.add(i);
            }
        }
        return res;
    }
}