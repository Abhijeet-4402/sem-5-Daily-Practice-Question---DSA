// Last updated: 1/3/2026, 11:09:19 pm
1class Solution {
2public:
3    bool isPowerOfTwo(int n) {
4        if(n<=0) return false;
5        return (n&(n-1))==0;
6    }
7};