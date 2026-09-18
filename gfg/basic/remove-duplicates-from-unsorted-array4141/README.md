# Remove Duplicates from Unsorted

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array  **arr[]** of integers which may or may not contain duplicate elements. Your task is to remove duplicate elements. Your result should have elements according their first appearance in the input array.

 **Examples:** 

```
Input: arr[] = [1, 2, 3, 1, 4, 2]
Output: [1, 2, 3, 4]
Explanation: 2 and 1 have more than 1 occurence.
```

```
Input: arr[] = [1, 2, 3, 4]
Output: [1, 2, 3, 4]
Explanation: There is no duplicate element.
```

 **Constraints:** 
1<=arr.size()<=106
1<=arr[i]<=105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-18T14:39:41.242Z  

```java
class Solution {
    static ArrayList<Integer> removeDuplicate(int arr[]) {
        // code here
        
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int i = 0; i < arr.length; i++){
            set.add(arr[i]);
        }
        ArrayList<Integer> a = new ArrayList<>(set);
        
        return a;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/remove-duplicates-from-unsorted-array4141/1)