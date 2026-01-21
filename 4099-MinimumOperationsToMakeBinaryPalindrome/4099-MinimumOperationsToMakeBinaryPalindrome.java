// Last updated: 21/1/2026, 11:42:19 am
class Solution {
    public int[] minOperations(int[] nums) {
        int n = nums.length;

        int maxVal = 0;
        for (int x : nums) maxVal = Math.max(maxVal, x);

        List<Integer> pals = generateBinaryPalindromes(maxVal * 2);

        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int x = nums[i];
            int idx = Collections.binarySearch(pals, x);

            if (idx >= 0) { 
                ans[i] = 0; 
                continue;
            }

            idx = -idx - 1;

            int best = Integer.MAX_VALUE;

            if (idx < pals.size()) {
                best = Math.min(best, pals.get(idx) - x);
            }
            if (idx - 1 >= 0) {
                best = Math.min(best, x - pals.get(idx - 1));
            }

            ans[i] = best;
        }

        return ans;
    }

    private List<Integer> generateBinaryPalindromes(int maxLimit) {
        List<Integer> list = new ArrayList<>();

        for (int len = 1; len <= 31; len++) {
            int half = (len + 1) / 2;
            int start = 1 << (half - 1);
            int end = 1 << half;

            for (int mask = start; mask < end; mask++) {
                int pal = buildPalindrome(mask, len % 2 == 1);
                if (pal > maxLimit) break;
                list.add(pal);
            }
        }

        Collections.sort(list);
        return list;
    }

    private int buildPalindrome(int half, boolean odd) {
        int rev = reverseBits(half >> (odd ? 1 : 0));
        return (half << (odd ? (halfBitLength(half) - 1) : halfBitLength(half))) | rev;
    }

    private int halfBitLength(int x) {
        return 32 - Integer.numberOfLeadingZeros(x);
    }

    private int reverseBits(int x) {
        int r = 0;
        while (x > 0) {
            r = (r << 1) | (x & 1);
            x >>= 1;
        }
        return r;
    }
}