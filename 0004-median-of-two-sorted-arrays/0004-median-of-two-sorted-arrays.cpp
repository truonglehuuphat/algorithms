class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        int m = nums1.size();
        int n = nums2.size();
        vector<int> merger;
        for(int i: nums1){
            merger.push_back(i);
        }
        for(int i: nums2){
            merger.push_back(i);
        }
        sort(merger.begin(),merger.end());
        // cout << m << " " << n  << endl;
        // cout << (m+n)/2 << " " << ((m+n)/2) -1  << endl;

        if((m + n) % 2 == 0){
            // cout << (m+n)/2 << " " << ((m+n)/2) -1  << endl;
            return (double)(merger[(m+n)/2] + merger[((m+n)/2) -1 ])/2.0;
        } else {
            return (double)merger[(m+n)/2]*1.0;
        }
    }
};