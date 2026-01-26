// Last updated: 27/1/2026, 12:30:37 am
1class Solution {
2    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
3        List<List<Integer>> ans = new ArrayList<>();
4        List<Integer> ll = new ArrayList<Integer>();
5        findCombinations(candidates, 0, target, ll, ans);
6        return ans;
7    }
8
9    private static void findCombinations(int[] candidates, int i, int target, List<Integer> ll,
10            List<List<Integer>> ans) {
11        // TODO Auto-generated method stub
12        if (i == candidates.length)
13            return;
14        if (target == 0) {
15            ans.add(new ArrayList(ll));
16            return;
17        }
18
19        //Not Take
20        findCombinations(candidates, i + 1, target, ll, ans);
21
22        //Take
23        if (candidates[i] <= target) {
24            ll.add(candidates[i]);
25            findCombinations(candidates, i, target - candidates[i], ll, ans);
26            ll.remove(ll.size() - 1);
27        }
28    }
29}