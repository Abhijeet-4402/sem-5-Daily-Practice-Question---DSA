// Last updated: 21/1/2026, 11:43:41 am
class Solution {
    public int mostBooked(int n, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> Long.compare((long) a[0], (long) b[0]));

        PriorityQueue<Long> empty = new PriorityQueue<>();
        for (long i = 0; i < n; i++) empty.offer(i);

        PriorityQueue<Pair> busy = new PriorityQueue<>(
            (a, b) -> a.time == b.time ? Long.compare(a.room, b.room) : Long.compare(a.time, b.time)
        );

        long[] count = new long[n];

        for (int[] m : meetings) {
            long start = m[0];
            long end = m[1];
            long duration = end - start;

            while (!busy.isEmpty() && busy.peek().time <= start) {
                empty.offer(busy.poll().room);
            }

            if (!empty.isEmpty()) {
                long room = empty.poll();
                busy.offer(new Pair(room, end));
                count[(int) room]++;
            } else {
                Pair p = busy.poll();
                long room = p.room;
                long newEnd = p.time + duration;
                busy.offer(new Pair(room, newEnd));
                count[(int) room]++;
            }
        }

        int ans = 0;
        for (int i = 1; i < n; i++) {
            if (count[i] > count[ans]) ans = i;
        }
        return ans;
    }

    class Pair {
        long room;
        long time;
        Pair(long r, long t) {
            room = r;
            time = t;
        }
    }
}
