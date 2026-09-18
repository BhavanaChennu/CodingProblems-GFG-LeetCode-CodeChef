# Count Group Occurrences

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string  **s**. Count the characters that have ‘k’ number of occurrences. If a character appears consecutively it is counted as 1 occurrence.

 **Examples:** 

```
Input: s = "abc", k = 1
Output: 3
Explanation: 'a', 'b' and 'c' all have 1 occurrence.

```

```
Input: s = "geeksforgeeks", k = 2
Output: 4
Explanation: 'g', 'e', 'k' and 's' have 2 occurrences.
```

```
Input: s = "aaaaa", k = 2
Output: 0
Explanation: There is only one group occurrence of 'a'
```

 **Constraints:** 
1<=s.length()<=105
1<=k<=103

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-18T14:09:24.215Z  

```java
class Sol {
    int getCount(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (i == 0 || curr != s.charAt(i - 1)) {
                map.put(curr, map.getOrDefault(curr, 0) + 1);
            }
        }

        int count = 0;
        for (int val : map.values()) {
            if (val == k) {
                count++;
            }
        }

        return count;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-the-characters1821/1)