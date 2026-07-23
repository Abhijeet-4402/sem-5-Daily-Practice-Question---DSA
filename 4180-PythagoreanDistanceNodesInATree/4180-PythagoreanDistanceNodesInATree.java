// Last updated: 23/7/2026, 9:35:06 am
class Solution {
    public int specialNodes(int n, int[][] edges, int x, int y, int z) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++)
            adj.add(new ArrayList<>());

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        int[] X = find(n, x, adj);
        int[] Y = find(n, y, adj);
        int[] Z = find(n, z, adj);

        int c = 0;
        for (int i = 0; i < n; i++) {
            long[] val = new long[3];
            val[0] = X[i];
            val[1] = Y[i];
            val[2] = Z[i];

            Arrays.sort(val);

            if(val[0]*val[0] + val[1]*val[1] == val[2]*val[2]) c++;
        }
        return c;
    }

    private int[] find(int n , int st, List<List<Integer>> adj){
        int [] dist = new int[n];
        Arrays.fill(dist, -1);
        Queue<Integer> q = new LinkedList<>();
        dist[st] = 0 ;
        q.offer(st);
        while(!q.isEmpty()){
            int curr = q.poll();
            for(int nbrs:adj.get(curr)){
                if(dist[nbrs]==-1){
                    dist[nbrs] = dist[curr]+1;
                    q.offer(nbrs);
                }
            }
        }
        return dist;
    }
}






