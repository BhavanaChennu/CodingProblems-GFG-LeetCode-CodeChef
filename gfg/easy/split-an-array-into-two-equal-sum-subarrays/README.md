# Two Equal Sum Subarrays

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array of integers  **arr[]**, return  **true** if it is possible to split it in two subarrays (without reordering the elements), such that the sum of the two subarrays are equal. If it is not possible then return  **false**.

 **Examples:** 

```
Input: arr[] = [1, 2, 3, 4, 5, 5]
Output: true
Explanation: We can divide the array into [1, 2, 3, 4] and [5, 5]. The sum of both the subarrays are 10.
```

```
Input: arr[] = [4, 3, 2, 1]
Output: false
Explanation: We cannot divide the array into two subarrays with equal sum.
```

**Constraints:
**1 ≤ arr.size() ≤ 105 
1 ≤ arr[i] ≤ 106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-08T16:27:29.384Z  

```java
class Solution {
    public boolean canSplit(int arr[]) {
        // code here
        int total = 0;
        for (int i = 0; i < arr.length; i++)
                total += arr[i];

        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
                leftSum += arr[i];

        int rightSum = total - leftSum;

        if (leftSum == rightSum)
                return true;
            }

        return false;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/split-an-array-into-two-equal-sum-subarrays/1)