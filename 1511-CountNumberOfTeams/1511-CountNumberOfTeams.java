// Last updated: 21/1/2026, 11:44:21 am
class Solution {
    public int numTeams(int[] rating) {
        int res = 0;
        for (int i = 1; i < rating.length - 1; ++i) {
            int left[] = new int[2], right[] = new int[2];
            for (int j = 0; j < rating.length; ++j) {
                if (rating[i] < rating[j])
                    ++left[j > i ? 1 : 0];
                if (rating[i] > rating[j])
                    ++right[j > i ? 1 : 0];
            }
            res += left[0] * right[1] + right[0] * left[1];
        }
        return res;
    }
}