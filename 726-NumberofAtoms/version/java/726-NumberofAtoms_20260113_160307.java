// Last updated: 13/1/2026, 4:03:07 pm
1class Solution {
2    public int mostBooked(int n, int[][] meetings) {
3        Arrays.sort(meetings, (a, b) -> Long.compare((long) a[0], (long) b[0]));
4
5        PriorityQueue<Long> empty = new PriorityQueue<>();
6        for (long i = 0; i < n; i++) empty.offer(i);
7
8        PriorityQueue<Pair> busy = new PriorityQueue<>(
9            (a, b) -> a.time == b.time ? Long.compare(a.room, b.room) : Long.compare(a.time, b.time)
10        );
11
12        long[] count = new long[n];
13
14        for (int[] m : meetings) {
15            long start = m[0];
16            long end = m[1];
17            long duration = end - start;
18
19            while (!busy.isEmpty() && busy.peek().time <= start) {
20                empty.offer(busy.poll().room);
21            }
22
23            if (!empty.isEmpty()) {
24                long room = empty.poll();
25                busy.offer(new Pair(room, end));
26                count[(int) room]++;
27            } else {
28                Pair p = busy.poll();
29                long room = p.room;
30                long newEnd = p.time + duration;
31                busy.offer(new Pair(room, newEnd));
32                count[(int) room]++;
33            }
34        }
35
36        int ans = 0;
37        for (int i = 1; i < n; i++) {
38            if (count[i] > count[ans]) ans = i;
39        }
40        return ans;
41    }
42
43    class Pair {
44        long room;
45        long time;
46        Pair(long r, long t) {
47            room = r;
48            time = t;
49        }
50    }
51}
52