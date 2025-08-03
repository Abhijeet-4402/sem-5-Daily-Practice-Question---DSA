// Last updated: 4/8/2025, 12:03:21 am
class Solution {
    public int fib(int n) {
        return Sequence(n);
    }
    public int Sequence(int n){
        if(n==1){
            return 1;
        }else if(n==0){
            return 0;
        }
        int a = 0;
        int b = 1;
        for(int i=2; i<=n; i++){
            int c= a+b;
            a=b;
            b=c;
        }
        return b;
    }
}