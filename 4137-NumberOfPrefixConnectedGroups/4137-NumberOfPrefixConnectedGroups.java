// Last updated: 23/7/2026, 9:35:13 am
class Solution {
    public int prefixConnected(String[] words, int k) {
        HashMap<String, Integer> mp = new HashMap<>();
        for (String word : words) {
            if(word.length()<k)continue;
            String pref = word.substring(0,k);
            mp.put(pref, mp.getOrDefault(pref, 0) + 1);
        }
        int c = 0;
        for (String key : mp.keySet()) {
            if (mp.get(key) > 1)
                c++;
        }

        return c;
    }
}