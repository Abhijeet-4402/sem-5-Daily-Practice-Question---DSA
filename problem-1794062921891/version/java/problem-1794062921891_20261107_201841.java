// Last updated: 7/11/2026, 8:18:41 pm
1class Solution {
2    public boolean canRemoveAll(int[] types, int[] colors, int[] groupSize) {
3        int n = types.length;
4        int[] type = new int[n];
5        int[] color = new int[n];
6        int[] count = new int[n];
7
8        int top = -1;
9        for(int i = 0; i < n ; i++){
10            int t = types[i];
11            int c = colors[i];
12
13            if(groupSize[t]==1) continue;
14
15            if(top>-1 && type[top]==t && color[top]==c){
16                count[top]++;
17
18                if(count[top]==groupSize[t]) top--;
19            } else{
20                top++;
21                type[top] = t;
22                color[top] = c;
23                count[top] = 1;
24            }
25        }
26
27        return top == -1;
28    }
29}