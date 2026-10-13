# Count Anagrams

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

You are given a string `s` containing one or more words. Every consecutive pair of words is separated by a single space `' '`.

A string `t` is an  **anagram**  of string `s` if the `ith` word of `t` is a  **permutation**  of the `ith` word of `s`.

- For example, "acb dfe" is an anagram of "abc def", but "def cab" and "adc bef" are not.

Return  *the number of  **distinct anagrams**  of* `s`. Since the answer may be very large, return it  **modulo**  `109 + 7`.

 

 **Example 1:** 

```
Input: s = "too hot"
Output: 18
Explanation: Some of the anagrams of the given string are "too hot", "oot hot", "oto toh", "too toh", and "too oht".

```

 **Example 2:** 

```
Input: s = "aa"
Output: 1
Explanation: There is only one anagram possible for the given string.
```

 

 **Constraints:** 

- 1 <= s.length <= 105
- s consists of lowercase English letters and spaces ' '.
- There is single space between consecutive words.

## Solution

**Language:** Java  
**Runtime:** 15 ms (beats 93.53%)  
**Memory:** 50.6 MB (beats 50.59%)  
**Submitted:** 2026-10-13T15:55:37.428Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/count-anagrams/)