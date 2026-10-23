# largest-prime-factor2601

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-23T14:26:14.873Z  

```java
import java.util.*;
class Solution {
    static int largestPrimeFactor(int n) {
        int i = 2;
        int largest = -1;

        while (i <= n) {
            if (n % i == 0) {
                largest = i;
                n = n / i;
            } else {
                i++;
            }
        }
        return largest;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/largest-prime-factor2601/1)