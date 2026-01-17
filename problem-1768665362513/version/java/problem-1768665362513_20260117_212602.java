// Last updated: 17/1/2026, 9:26:02 pm
1class Solution {
2    int [] state;
3    List<List<int[]>> adj;
4    List<Integer> res = new ArrayList<>();
5    public List<Integer> minimumFlips(int n, int[][] edges, String start, String target) {
6        state = new int[n];
7
8        int diff = 0;
9        for(int i = 0; i < n; i++){
10            state[i] = (start.charAt(i)==target.charAt(i))?0:1;
11            diff+=state[i];
12            
13        }
14        if((diff&1)==1){
15            return List.of(-1);
16        }
17
18        adj = new ArrayList<>();
19        for( int i = 0; i < n ; i++){
20            adj.add(new ArrayList<>());
21        }
22
23        for(int i =0; i <n-1;i++){
24            int u = edges[i][0];
25            int v = edges[i][1];
26
27            adj.get(u).add(new int[]{v,i});
28            adj.get(v).add(new int[]{u,i});
29        }
30
31        if( dfs(0,-1)==1){
32            return List.of(-1);
33        }
34
35        Collections.sort(res);
36        return res;
37    }
38
39    private int dfs(int u, int parent){
40        int curr = 0;
41
42        for( int [] edge:adj.get(u)){
43            int v = edge[0];
44            int idx = edge[1];
45
46            if(v==parent) continue;
47
48            int need = dfs(v,u);
49
50            if(need ==1){
51                res.add(idx);
52                curr^=1;
53            }
54        }
55        return curr^state[u];
56    }
57}