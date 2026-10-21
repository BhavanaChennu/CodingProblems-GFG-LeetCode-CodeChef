# Smallest Subset with Greater Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an array  **`arr[]`**  containing non-negative integers. Your task is to select the minimum number of elements such that the sum of the selected elements is greater than the sum of the remaining elements in the array.

 **Examples:** 

```
Input: arr[] = [2, 17, 7, 3]
Output: 1
Explanation: By selecting only the element 17, the sum of the remaining elements is 2 + 3 + 7 = 12, which is less than 17. Thus, the minimum number of elements required is 1.
```

```
Input: arr[] = [20, 12, 18, 4]
Output: 2
Explanation: By selecting 12 and 18, their sum becomes 12 + 18 = 30, which is greater than the sum of the remaining elements 20 + 4 = 24. Alternatively, selecting 20 and 18 would also satisfy the condition. Thus, the minimum number of elements required is 2.
```

```
Input: arr[] = [1, 1, 1, 1, 10]
Output: 1
Explanation: Selecting only the element 10 gives a sum of 10, which is greater than the sum of the remaining elements (1 + 1 + 1 + 1 = 4). Therefore, the minimum number of elements required is 1.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-21T07:26:20.355Z  

```java
class Solution {
    int minSubset(int[] arr) {
        // code here
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        Arrays.sort(arr);

        int result = 0;
        int currSum = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            currSum += arr[i];
            result++;

            if (currSum > (totalSum - currSum)) break;
        }

        return result;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/smallest-subset-with-greater-sum/1)