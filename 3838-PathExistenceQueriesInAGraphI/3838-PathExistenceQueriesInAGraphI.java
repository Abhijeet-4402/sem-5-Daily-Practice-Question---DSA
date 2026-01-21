// Last updated: 21/1/2026, 11:42:40 am
class Solution {

    int[] p, r;

    int f(int x){ return p[x]==x ? x : (p[x]=f(p[x])); }

    void u(int a,int b){
        if((a=f(a))==(b=f(b))) return;
        if(r[a]<r[b]) p[a]=b;
        else if(r[b]<r[a]) p[b]=a;
        else p[b]=a; r[a]++;
    }

    public boolean[] pathExistenceQueries(int n,int[] nums,int maxDiff,int[][] q){
        p=new int[n]; r=new int[n];
        for(int i=0;i<n;i++) p[i]=i;

        for(int i=1;i<n;i++) if(nums[i]-nums[i-1]<=maxDiff) u(i,i-1);

        boolean[] ans=new boolean[q.length];
        for(int i=0;i<q.length;i++) ans[i]=f(q[i][0])==f(q[i][1]);
        return ans;
    }
}
