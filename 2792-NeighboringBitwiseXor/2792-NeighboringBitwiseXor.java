// Last updated: 21/1/2026, 11:43:35 am
class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int xor = 0;
        for(int i:derived) xor^=i;
        return xor==0;
    }
}