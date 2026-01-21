// Last updated: 21/1/2026, 11:42:29 am
class Solution {
    public long countDistinct(long n) {
        String s = Long.toString(n);
        int L = s.length();
        long count = 0;

        long power9 = 1;
        for (int i = 1; i < L; i++) {
            count += 9 * power9;
            power9 *= 9;
        }

        power9 = 1;
        for (int i = 1; i < L; i++) {
            power9 *= 9;
        }

        for (int i = 0; i < L; i++) {
            int digit = s.charAt(i) - '0';

            if (digit == 0) {
                break;
            }

            count += (digit - 1) * power9;

            if (i == L - 1) {
                count++;
            }

            if (power9 > 0) {
                 power9 /= 9;
            }
        }
        
        return count;
    }
}