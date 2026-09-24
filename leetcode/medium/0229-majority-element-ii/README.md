# Majority Element II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array of size `n`, find all elements that appear more than `⌊n / 3⌋` times.

 

 **Example 1:** 

```
Input: nums = [3,2,3]
Output: [3]

```

 **Example 2:** 

```
Input: nums = [1]
Output: [1]

```

 **Example 3:** 

```
Input: nums = [1,2]
Output: [1,2]

```

 

 **Constraints:** 

- 1 <= nums.length <= 5 * 104
- -109 <= nums[i] <= 109

 

 **Follow up:**  Could you solve the problem in linear time and in `O(1)` space?

## Solution

**Language:** Java  
**Runtime:** 15 ms (beats 28.56%)  
**Memory:** 51.3 MB (beats 91.41%)  
**Submitted:** 2026-09-24T05:43:03.635Z  

```java
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int count = map.getOrDefault(nums[i], 0)+1;
            map.put(nums[i] , count);
            if(count == (n / 3) + 1){
                list.add(nums[i]);
            }
        }
        return list;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/majority-element-ii/)