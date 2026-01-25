// Last updated: 25/1/2026, 8:58:55 am
1class Solution {
2    public int specialNodes(int n, int[][] edges, int x, int y, int z) {
3        List<List<Integer>> adj = new ArrayList<>();
4        for (int i = 0; i < n; i++)
5            adj.add(new ArrayList<>());
6
7        for (int[] edge : edges) {
8            int u = edge[0];
9            int v = edge[1];
10            adj.get(u).add(v);
11            adj.get(v).add(u);
12        }
13
14        int[] X = find(n, x, adj);
15        int[] Y = find(n, y, adj);
16        int[] Z = find(n, z, adj);
17
18        int c = 0;
19        for (int i = 0; i < n; i++) {
20            long[] val = new long[3];
21            val[0] = X[i];
22            val[1] = Y[i];
23            val[2] = Z[i];
24
25            Arrays.sort(val);
26
27            if(val[0]*val[0] + val[1]*val[1] == val[2]*val[2]) c++;
28        }
29        return c;
30    }
31
32    private int[] find(int n , int st, List<List<Integer>> adj){
33        int [] dist = new int[n];
34        Arrays.fill(dist, -1);
35        Queue<Integer> q = new LinkedList<>();
36        dist[st] = 0 ;
37        q.offer(st);
38        while(!q.isEmpty()){
39            int curr = q.poll();
40            for(int nbrs:adj.get(curr)){
41                if(dist[nbrs]==-1){
42                    dist[nbrs] = dist[curr]+1;
43                    q.offer(nbrs);
44                }
45            }
46        }
47        return dist;
48    }
49}
50
51
52
53
54
55
56