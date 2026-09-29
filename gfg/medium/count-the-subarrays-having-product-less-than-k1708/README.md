# Subarrays Product Less than K

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array  **arr[]**  of positive numbers, the task is to find the number of possible contiguous subarrays having product less than  **k**.

 **Examples:** 

```
Input : k = 10, arr[] = [1, 2, 3, 4]
Output : 7
Explanation:
The contiguous subarrays whose product is less than 10 are [1], [2], [3], [4], [1, 2], [2, 3], and [1, 2, 3]. Therefore, the total number of valid contiguous subarrays is 7.
```

```
Input: k = 100, arr[] = [1, 9, 2, 8, 6, 4, 3]
Output: 16
Explanation: There are 16 contiguous subarrays whose product of elements is strictly less than 100. 
```

**Constraints:
**1 ≤ n ≤ 105
1 ≤ k ≤ 105
1 ≤ arr[i] ≤ 103

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-29T16:12:18.875Z  

```java
class Solution {
    public int countSubarray(int[] arr, int k) {
        // code here
                if (k <= 1) {
                    return 0;
                }
                int count = 0;
                int product = 1;
                int left = 0;
                for (int right = 0; right < arr.length; right++) {
                    product *= arr[right]; 
                    while (product >= k) {
                        product /= arr[left];
                        left++;
                    }
                    count += right - left + 1;
                }
                return count;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-the-subarrays-having-product-less-than-k1708/1)