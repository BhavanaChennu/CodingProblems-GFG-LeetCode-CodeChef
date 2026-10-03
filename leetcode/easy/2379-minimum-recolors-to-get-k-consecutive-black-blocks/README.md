# Minimum Recolors to Get K Consecutive Black Blocks

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a  **0-indexed**  string `blocks` of length `n`, where `blocks[i]` is either `'W'` or `'B'`, representing the color of the `ith` block. The characters `'W'` and `'B'` denote the colors white and black, respectively.

You are also given an integer `k`, which is the desired number of  **consecutive**  black blocks.

In one operation, you can  **recolor**  a white block such that it becomes a black block.

Return *the  **minimum**  number of operations needed such that there is at least  **one**  occurrence of* `k` *consecutive black blocks.* 

 

 **Example 1:** 

```
Input: blocks = "WBBWWBBWBW", k = 7
Output: 3
Explanation:
One way to achieve 7 consecutive black blocks is to recolor the 0th, 3rd, and 4th blocks
so that blocks = "BBBBBBBWBW". 
It can be shown that there is no way to achieve 7 consecutive black blocks in less than 3 operations.
Therefore, we return 3.

```

 **Example 2:** 

```
Input: blocks = "WBWBBBW", k = 2
Output: 0
Explanation:
No changes need to be made, since 2 consecutive black blocks already exist.
Therefore, we return 0.

```

 

 **Constraints:** 

- n == blocks.length
- 1 <= n <= 100
- blocks[i] is either 'W' or 'B'.
- 1 <= k <= n

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 94.88%)  
**Memory:** 43.1 MB (beats 11.54%)  
**Submitted:** 2026-10-03T05:14:54.332Z  

```java
class Solution {
    public int minimumRecolors(String blocks, int k) {
        int minop = 0 , tempWhite = 0;
        for(int i = 0; i < k; i++){
            char ch = blocks.charAt(i);
            if(ch == 'W'){
                tempWhite++;
            }
        }
        minop = tempWhite;
        for(int i = k; i < blocks.length(); i++){
            if( blocks.charAt(i - k) == 'W')
                tempWhite--;
            if( blocks.charAt(i) == 'W')
                tempWhite++;
            minop = Math.min(minop , tempWhite);        
        }
        return minop;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks/)