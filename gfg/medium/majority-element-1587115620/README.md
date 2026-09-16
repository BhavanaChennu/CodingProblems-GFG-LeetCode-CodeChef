# Majority Element

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array  **arr[]**. Find the  **majority element**  in the array. If no majority element exists, return  **-1**.

 **Note:**  A majority element in an array is an element that appears  **strictly** more than **arr.size()/2** times in the array.

 **Examples:** 

```
Input: arr[] = [1, 1, 2, 1, 3, 5, 1]
Output: 1
Explanation: Since, 1 is present more than 7/2 times, so it is the majority element.

```

```
Input: arr[] = [7]
Output: 7
Explanation: Since, 7 is single element and present more than 1/2 times, so it is the majority element.
```

```
Input: arr[] = [2, 13]
Output: -1
Explanation: Since, no element is present more than 2/2 times, so there is no majority element.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-16T09:52:46.884Z  

```java
class Solution {
    int majorityElement(int arr[]) {
        // code here
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            int count = map.getOrDefault(arr[i] , 0)+1;
            map.put(arr[i] , count);
            if(count > n/2){
                return arr[i];
            }
        }
        return -1;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/majority-element-1587115620/1)