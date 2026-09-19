# Maximum Value of a String in an Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

The  **value**  of an alphanumeric string can be defined as:

- The numeric representation of the string in base 10, if it comprises of digits only.
- The length of the string, otherwise.

Given an array `strs` of alphanumeric strings, return  *the  **maximum value**  of any string in* `strs`.

 

 **Example 1:** 

```
Input: strs = ["alic3","bob","3","4","00000"]
Output: 5
Explanation: 
- "alic3" consists of both letters and digits, so its value is its length, i.e. 5.
- "bob" consists only of letters, so its value is also its length, i.e. 3.
- "3" consists only of digits, so its value is its numeric equivalent, i.e. 3.
- "4" also consists only of digits, so its value is 4.
- "00000" consists only of digits, so its value is 0.
Hence, the maximum value is 5, of "alic3".

```

 **Example 2:** 

```
Input: strs = ["1","01","001","0001"]
Output: 1
Explanation: 
Each string in the array has value 1. Hence, we return 1.

```

 

 **Constraints:** 

- 1 <= strs.length <= 100
- 1 <= strs[i].length <= 9
- strs[i] consists of only lowercase English letters and digits.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 93.47%)  
**Memory:** 43 MB (beats 59.80%)  
**Submitted:** 2026-09-19T15:17:10.805Z  

```java
class Solution {
    public int maximumValue(String[] strs) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < strs.length; i++) {
            String sb = strs[i];
            int sum = 0; 
            boolean hasLetter = false;
            for (int j = 0; j < sb.length(); j++) {
                if (Character.isLetter(sb.charAt(j))) {
                    hasLetter = true;
                    break;
                }
            }
            if (hasLetter) {
                sum = sb.length();
            } else {
                sum = Integer.parseInt(sb);
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/maximum-value-of-a-string-in-an-array/)