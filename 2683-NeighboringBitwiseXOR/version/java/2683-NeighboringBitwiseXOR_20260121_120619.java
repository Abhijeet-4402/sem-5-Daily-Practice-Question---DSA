// Last updated: 21/1/2026, 12:06:19 pm
1class Solution {
2    public int getXORSum(int[] arr1, int[] arr2) {
3        int n = arr1.length;
4        int m = arr2.length;
5        int xor1 = 0, xor2 = 0;
6        for (int i : arr1)
7            xor1 ^= i;
8        for (int i : arr2)
9            xor2 ^= i;
10        return xor1 & xor2;
11
12    }
13}