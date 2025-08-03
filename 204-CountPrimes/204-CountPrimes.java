// Last updated: 4/8/2025, 12:06:49 am
class Solution {
    public int countPrimes(int n) {
        if(n<=2){
            return 0;
        }
        boolean []isprime=new boolean[n];
        for(int i=2;i*i<n;i++){
            if(!isprime[i]){
                for(int j=i*i;j<n;j+=i){
                    isprime[j]=true;
                }
            }
        }
        int count=0;
        for(int i=2;i<n;i++){
            if(!isprime[i]){
                count++;
            }
        }
        return count;
    }
}
