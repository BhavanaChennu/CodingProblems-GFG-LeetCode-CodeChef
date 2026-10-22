# Summary Ranges

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a  **sorted unique**  integer array `nums`.

A  **range**  `[a,b]` is the set of all integers from `a` to `b` (inclusive).

Return  *the  **smallest sorted**  list of ranges that  **cover all the numbers in the array exactly***. That is, each element of `nums` is covered by exactly one of the ranges, and there is no integer `x` such that `x` is in one of the ranges but not in `nums`.

Each range `[a,b]` in the list should be output as:

- "a->b" if a != b
- "a" if a == b

 

 **Example 1:** 

```
Input: nums = [0,1,2,4,5,7]
Output: ["0->2","4->5","7"]
Explanation: The ranges are:
[0,2] --> "0->2"
[4,5] --> "4->5"
[7,7] --> "7"

```

 **Example 2:** 

```
Input: nums = [0,2,3,4,6,8,9]
Output: ["0","2->4","6","8->9"]
Explanation: The ranges are:
[0,0] --> "0"
[2,4] --> "2->4"
[6,6] --> "6"
[8,9] --> "8->9"

```

 

 **Constraints:** 

- 0 <= nums.length <= 20
- -231 <= nums[i] <= 231 - 1
- All the values of nums are unique.
- nums is sorted in ascending order.

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 78.42%)  
**Memory:** 42.3 MB (beats 99.77%)  
**Submitted:** 2026-10-22T16:57:30.497Z  

```java
import java.util.*;
class Solution{
    public List<String> summaryRanges(int[] nums){
        List<String> res=new ArrayList<>();
        if(nums.length==0) return res;
        int start=nums[0];
        for(int i=0;i<nums.length;i++){
            if(i==nums.length-1 || nums[i]+1!=nums[i+1]){
                if(start==nums[i]) res.add(""+start);
                else res.add(start+"->"+nums[i]);
                if(i<nums.length-1) start=nums[i+1];
            }
        }
        return res;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/summary-ranges/)