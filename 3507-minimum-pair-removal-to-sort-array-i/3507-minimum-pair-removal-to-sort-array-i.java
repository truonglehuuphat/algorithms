class Solution {

    public int minimumPairRemoval(int[] nums) {
        int count = 0;
        List<Integer> ans = new ArrayList<>();
        for(int d : nums){
            ans.add(d);
        }
        while(ans.size() > 1){
            boolean isAsc = true;
            int targetIndex = -1;
            int minSum = Integer.MAX_VALUE;
            for(int i = 0 ; i  < ans.size()-1;i++)
            {   
                int sum = ans.get(i) + ans.get(i+1);
                if(ans.get(i) > ans.get(i+1)){
                    isAsc = false;
                }
                if(minSum > sum ){
                    minSum = sum;
                    targetIndex = i;
                }
            }

            if(isAsc == true) {
                break;
            }
            count++;
            ans.set(targetIndex, minSum);
            ans.remove(targetIndex +1);
        }
        return count;
    }
}