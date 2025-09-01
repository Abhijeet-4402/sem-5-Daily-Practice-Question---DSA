// Last updated: 2/9/2025, 12:19:37 am
class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Double.compare(
                gain(b[0], b[1]), 
                gain(a[0], a[1])
            )
        );

        for (int[] arr : classes) {
            pq.offer(arr);
        }

        while (extraStudents-- > 0) {
            int[] temp = pq.poll();
            temp[0]++;
            temp[1]++;
            pq.offer(temp);
        }

        double ans = 0.0;
        while (!pq.isEmpty()) {
            int[] temp = pq.poll();
            ans += (double) temp[0] / temp[1];
        }

        return ans / classes.length;
    }

    private double gain(int pass, int total) {
        return ((double)(pass + 1) / (total + 1)) - ((double) pass / total);
    }
}
