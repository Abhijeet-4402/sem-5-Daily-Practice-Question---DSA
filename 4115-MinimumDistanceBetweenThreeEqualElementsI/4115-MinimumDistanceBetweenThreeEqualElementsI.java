// Last updated: 21/1/2026, 11:42:16 am
class Solution {
    public static int minimumDistance(int[] arr) {
    Map<Integer, List<Integer>> map = new HashMap<>();

    for (int i = 0; i < arr.length; i++) {
        map.computeIfAbsent(arr[i], x -> new ArrayList<>()).add(i);
    }

    int ans = Integer.MAX_VALUE;

    for (int key : map.keySet()) {
        List<Integer> idx = map.get(key);  
        if (idx.size() >= 3) {
            for (int i = 0; i + 2 < idx.size(); i++) {
                int a = idx.get(i);
                int b = idx.get(i + 1);
                int c = idx.get(i + 2);

                int res = Math.abs(a - b) + Math.abs(b - c) + Math.abs(c - a);
                ans = Math.min(ans, res);
            }
        }
    }

    return ans == Integer.MAX_VALUE ? -1 : ans;
}

}