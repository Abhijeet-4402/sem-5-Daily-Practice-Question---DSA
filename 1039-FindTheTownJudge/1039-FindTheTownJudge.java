// Last updated: 4/8/2025, 12:03:11 am
class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] degree=new int[n+1];
        for(int[] edge:trust){
            --degree[edge[0]];
            ++degree[edge[1]];
        }
        for(int node=1;node<=n;node++){
            if(degree[node]== n-1){
                return node;
            }
        }
        return -1;
    }
}