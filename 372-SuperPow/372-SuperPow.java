// Last updated: 4/8/2025, 12:05:51 am
class Solution {
    static int M = 1337;
    public int superPow(int a, int[] b) {
        int ans = 1;
        a%=M;
        for(int i: b) ans = power(ans,10)*power(a,i) % M;
        return ans;
    }
    private int power(int a, int b){
        int ans = 1;
        a%=M;
        while(b>0){
            if((b & 1)==1) ans=ans*a%M;
            a=a*a %M;
            b>>=1;
        }
        return ans;
    }
}