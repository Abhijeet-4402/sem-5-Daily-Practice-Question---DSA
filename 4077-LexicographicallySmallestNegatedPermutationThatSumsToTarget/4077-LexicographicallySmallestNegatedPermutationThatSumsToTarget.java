// Last updated: 21/1/2026, 11:42:24 am
class Solution {
    public int[] lexSmallestNegatedPerm(int n, long target) {
        long mx = (long) n*(n+1)/2;
        if(target>mx || target<-mx) return new int[0];
        int[] a = new int[n];
        for(int i =0;i<n;i++)a[i] = i+1;
        long d = mx-target;
        if((d&1)==1) return new int[0];
        d>>=1;

        for(int i = n-1;i>=0&& d>0;i--){
            if(a[i]<=d){
                d-=a[i];
                a[i]=-a[i];
            }
        }

        Arrays.sort(a);
        return a;
    }
}