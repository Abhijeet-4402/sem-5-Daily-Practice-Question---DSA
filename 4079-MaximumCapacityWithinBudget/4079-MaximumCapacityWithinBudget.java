// Last updated: 23/7/2026, 9:35:25 am
class Solution {
    public int maxCapacity(int[] costs, int[] capacity, int budget) {

        int n = costs.length;
        int[][] machine = new int[n][2];

        for (int i = 0; i < n; i++) {
            machine[i][0] = costs[i];
            machine[i][1] = capacity[i];
        }

        Arrays.sort(machine, (a, b) -> a[0] - b[0]);

        int[] pre = new int[n];
        int mx = 0;
        for (int i = 0; i < n; i++) {
            mx = Math.max(mx, machine[i][1]);
            pre[i] = mx;
        }

        int ans = 0;
        int j = n - 1;

        for (int i = 0; i < n; i++) {
            int cost = machine[i][0];
            int cap = machine[i][1];

            if (cost < budget) {
                ans = Math.max(ans, cap);
            }

            while (j >= 0 && machine[j][0] >= budget - cost) {
                j--;
            }

            int k = Math.min(i - 1, j);
            if (k >= 0) {
                ans = Math.max(ans, cap + pre[k]);
            }
        }

        return ans;
    }
}


