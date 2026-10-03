# Maximum Length Substring With Two Occurrences

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s`, return the  **maximum**  length of a substring such that it contains  *at most two occurrences*  of each character.

 

 **Example 1:** 

 **Input:**  s = "bcbbbcba"

 **Output:**  4

 **Explanation:** 

The following substring has a length of 4 and contains at most two occurrences of each character: `"bcbbbcba"`.

 **Example 2:** 

 **Input:**  s = "aaaa"

 **Output:**  2

 **Explanation:** 

The following substring has a length of 2 and contains at most two occurrences of each character: `"aaaa"`.

 

 **Constraints:** 

- 2 <= s.length <= 100
- s consists only of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 100.00%)  
**Memory:** 43.5 MB (beats 73.32%)  
**Submitted:** 2026-10-03T11:40:05.753Z  

```java
class Solution {
    public int maximumLengthSubstring(String s) {
        int left = 0 , right = 0 , maxlen = 0;
        int[] letters = new int[26];
        while(right < s.length()){
            int rightIndex = s.charAt(right) - 'a';
            if(letters[rightIndex] < 2){
                letters[rightIndex]++;
                maxlen = Math.max(maxlen , right - left + 1);
                right++;
            }
            else{
                int leftIndex = s.charAt(left) - 'a';
                letters[leftIndex]--;
                left++;
            }
        }
        return maxlen;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/maximum-length-substring-with-two-occurrences/)