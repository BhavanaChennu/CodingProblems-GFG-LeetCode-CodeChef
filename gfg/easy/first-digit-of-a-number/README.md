# First Digit of Number

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a number  **n,** find the first digit of the number.

 **Examples:** 

```
Input: n = 123
Output: 1

```

```
Input: n = 976
Output: 9
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-30T16:32:39.352Z  

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