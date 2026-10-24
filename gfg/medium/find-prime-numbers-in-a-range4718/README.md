# find-prime-numbers-in-a-range4718

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-24T16:26:40.580Z  

```java
class Solution {
    public List<Integer> primeRange(int l, int r) {
        // code here
        ArrayList<Integer> primes = new ArrayList<>();

         for (int num = l; num <= r; num++) {
             if (isPrime(num)) {
                 primes.add(num);
             }
         }
         return primes;
    }
    private boolean isPrime(int n) {
         if (n <= 1) return false;
         if (n == 2) return true;
         if (n % 2 == 0) return false;

         int sqrtN = (int)Math.sqrt(n);
         for (int i = 3; i <= sqrtN; i += 2) {
             if (n % i == 0) return false;
         }
         return true;
     }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-prime-numbers-in-a-range4718/1)