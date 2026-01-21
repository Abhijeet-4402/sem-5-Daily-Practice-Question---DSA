// Last updated: 21/1/2026, 11:44:20 am
class Solution {

    private static final int MOD = 1000000007;

    int n;
    int fullMask;
    int[][] memo;
    Map<Integer, List<Integer>> hatUsers;

    public int numberWays(List<List<Integer>> hats) {
        n = hats.size();
        fullMask = (1 << n) - 1;

        hatUsers = new HashMap<>();
        for (int person = 0; person < n; person++) {
            for (int hat : hats.get(person)) {
                hatUsers
                    .computeIfAbsent(hat, k -> new ArrayList<>())
                    .add(person);
            }
        }

        memo = new int[41][1 << n];
        for (int i = 0; i <= 40; i++) {
            Arrays.fill(memo[i], -1);
        }

        return countWays(1, 0);
    }

    private int countWays(int hat, int mask) {
        if (mask == fullMask) return 1;
        if (hat > 40) return 0;

        if (memo[hat][mask] != -1) {
            return memo[hat][mask];
        }

        int ways = countWays(hat + 1, mask);

        if (hatUsers.containsKey(hat)) {
            for (int person : hatUsers.get(hat)) {
                if ((mask & (1 << person)) == 0) {
                    ways = (ways + countWays(
                        hat + 1,
                        mask | (1 << person)
                    )) % MOD;
                }
            }
        }

        return memo[hat][mask] = ways;
    }
}
