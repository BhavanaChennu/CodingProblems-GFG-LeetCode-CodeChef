# Add Digits

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer `num`, repeatedly add all its digits until the result has only one digit, and return it.

 

 **Example 1:** 

```
Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2 
Since 2 has only one digit, return it.

```

 **Example 2:** 

```
Input: num = 0
Output: 0

```

 

 **Constraints:** 

- 0 <= num <= 231 - 1

 

 **Follow up:**  Could you do it without any loop/recursion in `O(1)` runtime?

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 98.19%)  
**Memory:** 42.9 MB (beats 9.82%)  
**Submitted:** 2026-10-11T16:46:56.233Z  

```java
class Solution {
    public int addDigits(int num) {
        while( num >= 10){
            int total = 0;
            while( num > 0){
              int r = num % 10;
              total += r;
              num /= 10;
            }
            num = total;
        }
        return num;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/add-digits/)