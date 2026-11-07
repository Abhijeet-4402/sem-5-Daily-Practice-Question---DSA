// Last updated: 7/11/2026, 6:59:36 pm
1class Solution {
2    public int[] assignTasks(int[] servers, int[] tasks) {
3        PriorityQueue<int[]> available = new PriorityQueue<>((a, b) -> 
4            a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]
5        );
6        
7        PriorityQueue<int[]> busy = new PriorityQueue<>((a, b) -> 
8            a[0] == b[0] ? (a[1] == b[1] ? a[2] - b[2] : a[1] - b[1]) : a[0] - b[0]
9        );
10
11        for (int i = 0; i < servers.length; i++) {
12            available.offer(new int[] {servers[i], i});
13        }
14
15        int[] assigned = new int[tasks.length];
16
17        for (int i = 0; i < tasks.length; i++) {
18            while (!busy.isEmpty() && busy.peek()[0] <= i) {
19                int[] server = busy.poll();
20                available.offer(new int[] {server[1], server[2]});
21            }
22
23            if (!available.isEmpty()) {
24                int[] server = available.poll();
25                assigned[i] = server[1];
26                busy.offer(new int[] {i + tasks[i], server[0], server[1]});
27            } else {
28                int[] server = busy.poll();
29                assigned[i] = server[2];
30                server[0] += tasks[i]; 
31                busy.offer(server);
32            }
33        }
34        return assigned;
35    }
36}