// Last updated: 21/1/2026, 11:42:02 am
class Solution {
    int [] state;
    List<List<int[]>> adj;
    List<Integer> res = new ArrayList<>();
    public List<Integer> minimumFlips(int n, int[][] edges, String start, String target) {
        state = new int[n];

        int diff = 0;
        for(int i = 0; i < n; i++){
            state[i] = (start.charAt(i)==target.charAt(i))?0:1;
            diff+=state[i];
            
        }
        if((diff&1)==1){
            return List.of(-1);
        }

        adj = new ArrayList<>();
        for( int i = 0; i < n ; i++){
            adj.add(new ArrayList<>());
        }

        for(int i =0; i <n-1;i++){
            int u = edges[i][0];
            int v = edges[i][1];

            adj.get(u).add(new int[]{v,i});
            adj.get(v).add(new int[]{u,i});
        }

        if( dfs(0,-1)==1){
            return List.of(-1);
        }

        Collections.sort(res);
        return res;
    }

    private int dfs(int u, int parent){
        int curr = 0;

        for( int [] edge:adj.get(u)){
            int v = edge[0];
            int idx = edge[1];

            if(v==parent) continue;

            int need = dfs(v,u);

            if(need ==1){
                res.add(idx);
                curr^=1;
            }
        }
        return curr^state[u];
    }
}