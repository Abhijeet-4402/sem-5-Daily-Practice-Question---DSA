// Last updated: 21/1/2026, 11:43:25 am
class Solution {

    public int maximumLength(String s) {
        int n = s.length();
        int[][] freq = new int[26][n + 2];

        char prev = s.charAt(0);
        int len = 1;
        freq[prev - 'a'][1]++;

        for (int i = 1; i < n; i++) {
            char curr = s.charAt(i);
            if (curr == prev) {
                len++;
            } else {
                prev = curr;
                len = 1;
            }
            freq[curr - 'a'][len]++;
        }

        int ans = -1;

        for (int c = 0; c < 26; c++) {
            for (int l = n; l >= 1; l--) {
                freq[c][l] += freq[c][l + 1];
                if (freq[c][l] >= 3) {
                    ans = Math.max(ans, l);
                    break;
                }
            }
        }

        return ans;
    }
}
