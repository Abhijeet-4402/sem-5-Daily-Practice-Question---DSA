// Last updated: 21/1/2026, 11:42:18 am
class Solution {
    public boolean completePrime(int num) {
        if (num <= 1) return false;

        if (!isPrime(num)) return false;

        int prefix = num / 10;
        while (prefix > 0) {
            if (!isPrime(prefix)) return false;
            prefix /= 10;
        }

        long divisor = 10; 
        while (divisor < num) {
            if (!isPrime((int)(num % divisor))) return false;
            divisor *= 10;
        }

        return true;
    }

    private boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }
}