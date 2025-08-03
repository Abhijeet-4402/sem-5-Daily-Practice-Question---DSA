// Last updated: 4/8/2025, 12:01:57 am
class Solution {
    public int[] minOperations(String s) {
        int n = s.length();
        int[] arr = new int[n];

        int count = 0;
        // Left to right pass
        for (int i = 0; i < n; i++) {
            if (i > 0) arr[i] = arr[i - 1] + count;
            if (s.charAt(i) == '1') count++;
        }

        count = 0;
        int rightSum = 0;
        // Right to left pass
        for (int i = n - 1; i >= 0; i--) {
            arr[i] += rightSum;
            if (s.charAt(i) == '1') count++;
            rightSum += count;
        }

        return arr;
    }
}
