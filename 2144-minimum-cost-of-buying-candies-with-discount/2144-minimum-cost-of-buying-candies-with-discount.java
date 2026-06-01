class Solution {
    public int minimumCost(int[] cost) {
        int sum = 0;
        int n = cost.length;
        List<Integer> ans = new ArrayList<>();
        for(int d: cost){
            ans.add(d);
        }
        Collections.sort(ans, Collections.reverseOrder());
        int cnt = 0;
        for(int i = 0 ; i < n ;i++){
            if(cnt < 2){
                sum += ans.get(i);
                cnt++;
            } else {
                cnt = 0;
            }
        }
        return sum;
    }
}