class Solution {
    public int thirdMax(int[] nums) {
        // int n = nums.length;
        // List<Integer> ans = new ArrayList<>();
        // for(int i: nums){
        //     ans.add(i);
        // }
        // Collections.sort(ans, Collections.reverseOrder());
        // // System.out.println(n);
        // int count= 2;
        // int i = 1;
        // int maxF0 = ans.get(0);
        // int maxF1 = Integer.MIN_VALUE;
        // int maxF2 = Integer.MIN_VALUE;        
        // if(n < 3) {
        //     return ans.get(0);
        // }
        // else if((n == 3 && ans.get(2) == ans.get(1) )|| 
        // (n >= 3 && ans.get(0) == ans.get(1))){
        //     return ans.get(0);
        // }
        // else if (n == 3 && ans.get(1) > ans.get(2)){
        //     return ans.get(2);
        // }
        //  else {
        //     for(i = 1; i < n; i++){
        //         if(ans.get(i) < maxF0 && maxF1 < ans.get(i)){
        //             maxF1 = ans.get(i);
        //         } 
        //         if(maxF0 > maxF1 && ans.get(i) < maxF0 && ans.get(i) < maxF1  &&  ans.get(i) > maxF2){
        //             maxF2 = ans.get(i);
        //             break;
        //         }
        //     }
        // }
        // if(maxF2 == Integer.MIN_VALUE) {
        //     return ans.get(0);
        // } else {
        //     return maxF2;
        // }
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