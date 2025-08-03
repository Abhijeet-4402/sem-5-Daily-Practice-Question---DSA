// Last updated: 4/8/2025, 12:07:18 am
class Solution {
    public int singleNumber(int[] nums) {
        int one = 0, two = 0;
        for(int i : nums){
            one=(one^i)& ~two;
            two=(two^i)& ~one;
        }
        return one;
    }
}