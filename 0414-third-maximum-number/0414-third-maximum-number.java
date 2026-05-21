class Solution {
    public int thirdMax(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        for(int i: nums){
            ans.add(i);
        }
        Collections.sort(ans, Collections.reverseOrder());
        int max = ans.get(0);
        int second = Integer.MIN_VALUE;
        int i = 1;
        int res = max;
        while(i < n){
            if(max > ans.get(i) && second< ans.get(i)){
                second = ans.get(i);
            } else if( second > ans.get(i)) {
                res = ans.get(i);
                break;
            }
            i++;
        }
        return res;
    }
}