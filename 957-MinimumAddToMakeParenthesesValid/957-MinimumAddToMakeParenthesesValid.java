// Last updated: 4/8/2025, 12:03:30 am
class Solution {
    public int minAddToMakeValid(String s) {
        int op = 0, cl = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                cl++;
            } else if (cl > 0)
                cl--;
            else
                op++;
        }

        return op + cl;
    }
}
