class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        // int min = Integer.MAX_VALUE;
        int min = -1;
        // List<Integer> ans = new ArrayList<>();
        int i =0, n = nums1.length;
        int j =0, m =nums2.length;
        while(i < n && j< m){
            if(nums1[i] > nums2[j]){
                j++;
            } else if(nums1[i] < nums2[j]){
                i++;
            } else {
                min = nums1[i];
                break;
            }
        }
        // Collections.sort(ans);
        // return ans.get(0);
        return min;
    }
}