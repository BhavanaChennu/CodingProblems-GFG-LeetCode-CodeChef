# first-digit-of-a-number

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-11T16:45:26.253Z  

```java
class Solution {
    public static int firstDigit(int n) {
        // code here
        int first = 0;
        while(n > 0){
            int r = n % 10;
            first = r;
            n = n/10;
        }
        return first;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/first-digit-of-a-number/1)