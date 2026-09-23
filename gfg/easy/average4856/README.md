# Average of Prefixes

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array  **arr**, find the floor of average of the prefix array at every index. 

 **Examples:** 

```
Input: arr[] = [10, 20, 30, 40, 50]
Output: [10, 15, 20, 25, 30] 
Explanation: 10 / 1 = 10, (10 + 20) / 2 = 15, (10 + 20 + 30) / 3 = 20 and so on.

```

```
Input: arr[] = [12, 1]
Output: [12, 6] 
```

 **Constraints:** 
1 ≤ arr.size ≤ 105
1 ≤ arr[i] ≤ 106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-23T17:04:23.583Z  

```java
class Solution {
    public int[] prefixAvg(int[] arr) {
        // code here
        int sum = 0;
        int ans[] = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
            int length = i + 1;
            int avg = sum / length;
            ans[i] = avg;
        }
        return ans;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/average4856/1)