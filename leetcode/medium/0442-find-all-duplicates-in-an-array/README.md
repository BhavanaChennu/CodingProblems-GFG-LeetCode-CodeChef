# Find All Duplicates in an Array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array `nums` of length `n` where all the integers of `nums` are in the range `[1, n]` and each integer appears  **at most**   **twice**, return  *an array of all the integers that appears  **twice***.

You must write an algorithm that runs in `O(n)` time and uses only  *constant*  auxiliary space, excluding the space needed to store the output

 

 **Example 1:** 

```
Input: nums = [4,3,2,7,8,2,3,1]
Output: [2,3]

```

 **Example 2:** 

```
Input: nums = [1,1,2]
Output: [1]

```

 **Example 3:** 

```
Input: nums = [1]
Output: []

```

 

 **Constraints:** 

- n == nums.length
- 1 <= n <= 105
- 1 <= nums[i] <= n
- Each element in nums appears once or twice.

## Solution

**Language:** Java  
**Runtime:** 42 ms (beats 5.05%)  
**Memory:** 72.9 MB (beats 5.73%)  
**Submitted:** 2026-09-24T04:42:30.702Z  

```java
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : nums){
            map.put(num , map.getOrDefault(num , 0)+1);
            if(map.get(num) >= 2){
                list.add(num);
            }    
        }
        return list;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-all-duplicates-in-an-array/)