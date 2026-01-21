// Last updated: 21/1/2026, 11:29:02 am
1class Solution {
2    public boolean doesValidArrayExist(int[] derived) {
3        int xor = 0;
4        for(int i:derived) xor^=i;
5        return xor==0;
6    }
7}