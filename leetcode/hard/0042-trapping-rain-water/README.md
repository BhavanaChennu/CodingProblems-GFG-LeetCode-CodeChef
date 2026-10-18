# Trapping Rain Water

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given `n` non-negative integers representing an elevation map where the width of each bar is `1`, compute how much water it can trap after raining.

 

 **Example 1:** 

```
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.

```

 **Example 2:** 

```
Input: height = [4,2,0,3,2,5]
Output: 9

```

 

 **Constraints:** 

- n == height.length
- 1 <= n <= 2 * 104
- 0 <= height[i] <= 105

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 56.59%)  
**Memory:** 47.2 MB (beats 97.70%)  
**Submitted:** 2026-10-17T15:25:21.288Z  

```java
class Solution {
    public int trap(int[] height) {
        int left = 0 , right = height.length-1 , totalWater = 0;
        int leftMax = height[left] , rightMax = height[right];
        while(left < right){
            if(leftMax < rightMax){
                left++;
                leftMax = Math.max(leftMax , height[left]);
                totalWater += leftMax - height[left];
            }
            else{
                right--;
                rightMax = Math.max(rightMax , height[right]);
                totalWater += rightMax - height[right];
            }
        }
        return totalWater;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/trapping-rain-water/)