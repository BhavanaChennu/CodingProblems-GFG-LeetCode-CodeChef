# Longest Common Prefix

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string `""`.

 

 **Example 1:** 

```
Input: strs = ["flower","flow","flight"]
Output: "fl"

```

 **Example 2:** 

```
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

```

 

 **Constraints:** 

- 1 <= strs.length <= 200
- 0 <= strs[i].length <= 200
- strs[i] consists of only lowercase English letters if it is non-empty.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 58.64%)  
**Memory:** 42.7 MB (beats 96.02%)  
**Submitted:** 2026-10-19T16:23:04.948Z  

```java
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        Arrays.sort(strs);

        int i = 0, j = strs.length - 1;
        int m = 0, n = strs[i].length() - 1;

        while (m <= n) {
            if (strs[i].charAt(m) == strs[j].charAt(m)) {
                m++;
            } else {
                break;
            }
        }

        return strs[i].substring(0, m);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-common-prefix/)