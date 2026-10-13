class Solution {
    private static final int MOD = 1000000007;
    private long power(long base, long exp) {
        long res = 1;
        base %= MOD;
        while (exp > 0) {
            if ((exp & 1) == 1) res = (res * base) % MOD;
            base = (base * base) % MOD;
            exp >>= 1;
        }
        return res;
    }
    private long modInverse(long n) {
        return power(n, MOD - 2);
    }
    public int countAnagrams(String s) {
        String[] words = s.split(" ");
        int maxLen = 0;
        for (String w : words) {
            maxLen = Math.max(maxLen, w.length());
        }
        long[] fact = new long[maxLen + 1];
        fact[0] = 1;
        for (int i = 1; i <= maxLen; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
        }
        long totalWays = 1;
        for (String word : words) {
            int n = word.length();
            int[] count = new int[26];
            for (char c : word.toCharArray()) {
                count[c - 'a']++;
            }
            long ways = fact[n];
            for (int c : count) {
                if (c > 1) {
                    ways = (ways * modInverse(fact[c])) % MOD;
                }
            }
            totalWays = (totalWays * ways) % MOD;
        }
        return (int) totalWays;
    }
}