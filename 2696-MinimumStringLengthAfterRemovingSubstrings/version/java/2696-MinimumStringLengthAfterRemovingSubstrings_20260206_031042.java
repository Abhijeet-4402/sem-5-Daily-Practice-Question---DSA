// Last updated: 6/2/2026, 3:10:42 am
1class Solution {
2    public int maxSumMinProduct(int[] arr) {
3    int n = arr.length;
4    long MOD = 1000000007;
5
6    long[] prefix = new long[n + 1];
7    for (int i = 0; i < n; i++)
8        prefix[i + 1] = prefix[i] + arr[i];
9
10    Stack<Integer> st = new Stack<>();
11    long ans = 0;
12
13    for (int i = 0; i <= n; i++) {
14
15        while (!st.isEmpty() && (i == n || arr[st.peek()] > arr[i])) {
16
17            int idx = st.pop();
18
19            int left = st.isEmpty() ? 0 : st.peek() + 1;
20            int right = i;
21
22            long sum = prefix[right] - prefix[left];
23            ans = Math.max(ans, sum * arr[idx]);
24        }
25
26        st.push(i);
27    }
28
29    return (int)(ans % MOD);
30}
31
32}