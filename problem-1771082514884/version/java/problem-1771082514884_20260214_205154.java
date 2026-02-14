// Last updated: 14/2/2026, 8:51:54 pm
1class Solution {
2    public int prefixConnected(String[] words, int k) {
3        HashMap<String, Integer> mp = new HashMap<>();
4        for (String word : words) {
5            if(word.length()<k)continue;
6            String pref = word.substring(0,k);
7            mp.put(pref, mp.getOrDefault(pref, 0) + 1);
8        }
9        int c = 0;
10        for (String key : mp.keySet()) {
11            if (mp.get(key) > 1)
12                c++;
13        }
14
15        return c;
16    }
17}