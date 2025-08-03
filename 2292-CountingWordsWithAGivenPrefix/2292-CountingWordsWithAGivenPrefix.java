// Last updated: 4/8/2025, 12:01:33 am
class Solution {
    public int prefixCount(String[] words, String pref) {
        int c = 0;
        int n = pref.length();
        for (String w : words) {
            if (w.length() >= n && w.startsWith(pref)) {
                c++;
            }
        }
        return c;
        
    }
}