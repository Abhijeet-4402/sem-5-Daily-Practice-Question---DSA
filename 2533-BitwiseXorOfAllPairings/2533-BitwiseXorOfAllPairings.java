// Last updated: 21/1/2026, 11:43:39 am
class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int xor = 0;
        if((m&1)==1){
            for(int i : nums1) xor^=i;
        }
        if((n&1)==1){
            for( int i : nums2) xor^=i;
        }

        return xor;
    }
}