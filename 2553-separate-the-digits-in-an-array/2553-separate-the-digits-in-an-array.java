class Solution {
    public int[] digitsNums(int n){
        List<Integer> ans = new ArrayList<>();
        int index = 0;
        while(n>0){
            ans.add(n % 10);
            n = n / 10;
            index++;
        }
        Collections.reverse(ans);
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
    public int[] separateDigits(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        for(int d: nums){
            int[] digits = digitsNums(d);
            for(int j : digits){
                ans.add(j);
            }
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}